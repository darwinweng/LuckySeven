package com.luckyseven.app.ui.home

import androidx.navigation.NavDirections
import com.luckyseven.app.MainNavDirections

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionToHome(): NavDirections = MainNavDirections.actionToHome()
  }
}
