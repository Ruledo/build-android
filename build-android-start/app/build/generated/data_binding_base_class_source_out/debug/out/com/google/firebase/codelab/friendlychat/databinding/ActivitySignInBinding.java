// Generated by view binder compiler. Do not edit!
package com.google.firebase.codelab.friendlychat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.codelab.friendlychat.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout signInLayout;

  private ActivitySignInBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout signInLayout) {
    this.rootView = rootView;
    this.signInLayout = signInLayout;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    FrameLayout signInLayout = (FrameLayout) rootView;

    return new ActivitySignInBinding((FrameLayout) rootView, signInLayout);
  }
}
