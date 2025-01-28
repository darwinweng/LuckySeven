package com.luckyseven.app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.luckyseven.app.vo.LoginBody
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(): ViewModel() {

    private val _authState = MutableLiveData<AuthState>()
    val authState: LiveData<AuthState> = _authState

    fun login(body: LoginBody){
        _authState.value = AuthLoading
        viewModelScope.launch {
            delay(1000)
            _authState.value = ShowLoginSuccess(body)
        }
    }
}

sealed class AuthState

object AuthLoading : AuthState()
data class ShowLoginSuccess(val user: LoginBody?): AuthState()