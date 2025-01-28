package com.luckyseven.app.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.luckyseven.app.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/luckyseven/app/view/LuckySevenLoading;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cpTitle", "Landroid/widget/TextView;", "dialog", "Lcom/luckyseven/app/view/LuckySevenLoading$CustomDialog;", "dismissLoading", "", "showLoading", "title", "", "CustomDialog", "app_debug"})
public final class LuckySevenLoading {
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView cpTitle;
    @org.jetbrains.annotations.Nullable()
    private com.luckyseven.app.view.LuckySevenLoading.CustomDialog dialog;
    
    public LuckySevenLoading(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    public final void showLoading(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    public final void dismissLoading() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/luckyseven/app/view/LuckySevenLoading$CustomDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class CustomDialog extends android.app.Dialog {
        
        public CustomDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
}