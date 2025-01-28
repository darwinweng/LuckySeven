package com.luckyseven.app.ui.auth

import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.text.method.PasswordTransformationMethod
import android.view.View
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.luckyseven.app.R
import com.luckyseven.app.databinding.FragmentLoginBinding
import com.luckyseven.app.ui.BaseFragment
import com.luckyseven.app.utils.isEmpty
import com.luckyseven.app.utils.showIf
import com.luckyseven.app.utils.string
import com.luckyseven.app.view.LuckySevenLoading
import com.luckyseven.app.viewmodel.AuthLoading
import com.luckyseven.app.viewmodel.AuthViewModel
import com.luckyseven.app.viewmodel.ShowLoginSuccess
import com.luckyseven.app.vo.LoginBody
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginFragment: BaseFragment(R.layout.fragment_login) {

    override fun showToolbar(): Boolean = false
    private val progressDialog by lazy { LuckySevenLoading(requireContext()) }

    private val authVM: AuthViewModel by viewModels()

    private lateinit var binding: FragmentLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        getUser()
        events()
    }

    private fun events(){
        binding.apply {
            btnSignIn.setOnClickListener {
                if (isValid()){
                    val body = LoginBody().apply {
                        this.username = etUsername.string()
                        this.password = etPassword.string()
                    }
                    authVM.login(body)
                }
            }
            etPassword.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
                override fun afterTextChanged(s: Editable?) {
                    binding.imgPassword.showIf(s.toString().isNotEmpty())
                }
            })

            imgPassword.setOnClickListener {
                it.isSelected = !it.isSelected
                if (it.isSelected) {
                    etPassword.inputType = InputType.TYPE_CLASS_TEXT or
                            InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                }else etPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                requireActivity().runOnUiThread {
                    etPassword.post {
                        etPassword.setSelection(etPassword.string().length)
                    }
                }
            }
        }
    }

    private fun getUser(){
        authVM.authState.observe(viewLifecycleOwner){
            when(it){
                is AuthLoading -> progressDialog.showLoading()
                is ShowLoginSuccess -> {
                    CoroutineScope(Dispatchers.Main).launch {
                        delay(3000)
                        progressDialog.dismissLoading()
                        navController().navigate(R.id.action_to_home)
                    }
                }
            }
        }
    }

    private fun isValid(): Boolean {
        var valid = true

        if (binding.etUsername.isEmpty()){
            valid = false
        }

        if (binding.etPassword.isEmpty()){
            valid = false
        }

        return valid
    }
}