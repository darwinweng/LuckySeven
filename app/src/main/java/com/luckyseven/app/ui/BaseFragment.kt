package com.luckyseven.app.ui

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.luckyseven.app.activity.MainActivity
import com.luckyseven.app.utils.hide
import com.luckyseven.app.utils.resDrawable
import com.luckyseven.app.utils.show

abstract class BaseFragment(@LayoutRes res: Int): Fragment(res) {

    private val main: MainActivity? by lazy {
        requireActivity() as? MainActivity
    }

    protected open fun showToolbar(): Boolean = true
    protected open val  showBottomNav: Boolean = false
    protected open fun title(): String = ""

    override fun onResume() {
        main?.apply {
            toolbar.let{
                if(showToolbar()){
                    it.show()
                }else it.hide()

                it.title = if(title().isNotEmpty()) title() else ""
                it.menu.clear()

                it.navigationIcon = null
                it.setNavigationOnClickListener { navController().popBackStack() }
            }
        }
        super.onResume()
    }

    protected fun ownTitle(title: String){
        main?.toolbar?.title = title
    }

    protected fun ownIcon(res: Int?){
        main?.toolbar?.navigationIcon = if(res == null) null else context?.resDrawable(res)
    }

    protected fun navController() = findNavController()

    companion object {
        val TAG: String = "BaseFragment"
    }
}