package com.luckyseven.app.view

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import com.luckyseven.app.R

class LuckySevenLoading constructor(context: Context?) {
    private var cpTitle: TextView? = null
    private var dialog: CustomDialog? = null

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_ls_loading, null)
        cpTitle = view.findViewById(R.id.lbl_title)
        dialog = context?.let { CustomDialog(it) }
        dialog?.setContentView(view)
    }

    fun showLoading(title: String? = "Please Wait..."){
        if (title?.isNotEmpty() == true){
            cpTitle?.text = title
        }
        if (dialog == null)return
        dialog?.show()
        dialog?.setCancelable(false)
    }

    fun dismissLoading(){
        if (dialog != null) dialog?.dismiss()
    }

    class CustomDialog(context: Context) : Dialog(context, R.style.CustomDialogTheme) {
        init {
            // Set Semi-Transparent Color for Dialog Background
            window?.decorView?.rootView?.setBackgroundResource(R.color.translucent)
            window?.decorView?.setOnApplyWindowInsetsListener { _, insets ->
                insets.consumeSystemWindowInsets()
            }
        }
    }
}