package com.luckyseven.app.ui;

import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import com.luckyseven.app.activity.MainActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0004\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\b\u0010\u0018\u001a\u00020\fH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/luckyseven/app/ui/BaseFragment;", "Landroidx/fragment/app/Fragment;", "res", "", "(I)V", "main", "Lcom/luckyseven/app/activity/MainActivity;", "getMain", "()Lcom/luckyseven/app/activity/MainActivity;", "main$delegate", "Lkotlin/Lazy;", "showBottomNav", "", "getShowBottomNav", "()Z", "navController", "Landroidx/navigation/NavController;", "onResume", "", "ownIcon", "(Ljava/lang/Integer;)V", "ownTitle", "title", "", "showToolbar", "Companion", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy main$delegate = null;
    private final boolean showBottomNav = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BaseFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.luckyseven.app.ui.BaseFragment.Companion Companion = null;
    
    public BaseFragment(@androidx.annotation.LayoutRes()
    int res) {
        super();
    }
    
    private final com.luckyseven.app.activity.MainActivity getMain() {
        return null;
    }
    
    protected boolean showToolbar() {
        return false;
    }
    
    protected boolean getShowBottomNav() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String title() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    protected final void ownTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    protected final void ownIcon(@org.jetbrains.annotations.Nullable()
    java.lang.Integer res) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.navigation.NavController navController() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/luckyseven/app/ui/BaseFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}