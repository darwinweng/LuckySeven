package com.luckyseven.app.ui.auth

import androidx.navigation.NavDirections
import com.luckyseven.app.MainNavDirections

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionToHome(): NavDirections = MainNavDirections.actionToHome()
  }
}
