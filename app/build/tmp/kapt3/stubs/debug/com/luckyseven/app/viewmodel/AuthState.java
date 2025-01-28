package com.luckyseven.app.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.luckyseven.app.vo.LoginBody;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/luckyseven/app/viewmodel/AuthState;", "", "()V", "Lcom/luckyseven/app/viewmodel/AuthLoading;", "Lcom/luckyseven/app/viewmodel/ShowLoginSuccess;", "app_debug"})
public abstract class AuthState {
    
    private AuthState() {
        super();
    }
}