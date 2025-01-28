package com.luckyseven.app.ui.auth;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.luckyseven.app.R;
import com.luckyseven.app.databinding.FragmentLoginBinding;
import com.luckyseven.app.ui.BaseFragment;
import com.luckyseven.app.view.LuckySevenLoading;
import com.luckyseven.app.viewmodel.AuthLoading;
import com.luckyseven.app.viewmodel.AuthViewModel;
import com.luckyseven.app.viewmodel.ShowLoginSuccess;
import com.luckyseven.app.vo.LoginBody;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/luckyseven/app/ui/auth/LoginFragment;", "Lcom/luckyseven/app/ui/BaseFragment;", "()V", "authVM", "Lcom/luckyseven/app/viewmodel/AuthViewModel;", "getAuthVM", "()Lcom/luckyseven/app/viewmodel/AuthViewModel;", "authVM$delegate", "Lkotlin/Lazy;", "binding", "Lcom/luckyseven/app/databinding/FragmentLoginBinding;", "progressDialog", "Lcom/luckyseven/app/view/LuckySevenLoading;", "getProgressDialog", "()Lcom/luckyseven/app/view/LuckySevenLoading;", "progressDialog$delegate", "events", "", "getUser", "isValid", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showToolbar", "app_debug"})
public final class LoginFragment extends com.luckyseven.app.ui.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy progressDialog$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy authVM$delegate = null;
    private com.luckyseven.app.databinding.FragmentLoginBinding binding;
    
    public LoginFragment() {
        super(0);
    }
    
    @java.lang.Override()
    protected boolean showToolbar() {
        return false;
    }
    
    private final com.luckyseven.app.view.LuckySevenLoading getProgressDialog() {
        return null;
    }
    
    private final com.luckyseven.app.viewmodel.AuthViewModel getAuthVM() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void events() {
    }
    
    private final void getUser() {
    }
    
    private final boolean isValid() {
        return false;
    }
}