// Generated by Dagger (https://dagger.dev).
package com.luckyseven.app.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  @Override
  public AuthViewModel get() {
    return newInstance();
  }

  public static AuthViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthViewModel newInstance() {
    return new AuthViewModel();
  }

  private static final class InstanceHolder {
    private static final AuthViewModel_Factory INSTANCE = new AuthViewModel_Factory();
  }
}
