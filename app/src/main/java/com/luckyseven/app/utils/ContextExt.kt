package com.luckyseven.app.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun Context.resColor(res: Int): Int = ContextCompat.getColor(this, res)


fun Fragment.resColor(res: Int) = requireActivity().resColor(res)
fun Context.resDrawable(res: Int): Drawable? = ContextCompat.getDrawable(this, res)