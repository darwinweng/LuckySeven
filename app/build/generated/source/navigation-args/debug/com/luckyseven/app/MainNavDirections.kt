package com.luckyseven.app

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class MainNavDirections private constructor() {
  public companion object {
    public fun actionToHome(): NavDirections = ActionOnlyNavDirections(R.id.action_to_home)
  }
}
