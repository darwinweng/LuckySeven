package com.luckyseven.app.utils

import android.view.View
import android.widget.EditText

fun View.showIf(show: Boolean?) {
    if (show == true) {
        show()
    } else {
        hide(0)
    }
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide(type: Int = 1) {
    this.visibility = if (type == 1) View.GONE else View.INVISIBLE
}
fun EditText.isEmpty(err: String = "Required", len: Int = 0, errLen: String = "Minimum of $len characters"): Boolean {
    var isNotValid = false
    val notValidLength = (len > 0 && text.toString().length < len)
    when {
        text.isEmpty() -> {
            error = err
            isSelected = true
            isNotValid = true
        }
        notValidLength -> {
            error = errLen
            isSelected = true
            isNotValid = true
        }
        else -> {
            error = null
            isSelected = false
        }
    }
    return isNotValid
}

fun EditText.string(): String = text.toString()
