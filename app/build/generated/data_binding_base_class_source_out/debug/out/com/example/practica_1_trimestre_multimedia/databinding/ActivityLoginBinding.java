// Generated by view binder compiler. Do not edit!
package com.example.practica_1_trimestre_multimedia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.practica_1_trimestre_multimedia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button enterLoginButton;

  @NonNull
  public final Button goBackMainLButton;

  @NonNull
  public final EditText passwordLField;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final EditText usernameLField;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button enterLoginButton,
      @NonNull Button goBackMainLButton, @NonNull EditText passwordLField,
      @NonNull TextView textView3, @NonNull EditText usernameLField) {
    this.rootView = rootView;
    this.enterLoginButton = enterLoginButton;
    this.goBackMainLButton = goBackMainLButton;
    this.passwordLField = passwordLField;
    this.textView3 = textView3;
    this.usernameLField = usernameLField;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.enterLoginButton;
      Button enterLoginButton = ViewBindings.findChildViewById(rootView, id);
      if (enterLoginButton == null) {
        break missingId;
      }

      id = R.id.goBackMainLButton;
      Button goBackMainLButton = ViewBindings.findChildViewById(rootView, id);
      if (goBackMainLButton == null) {
        break missingId;
      }

      id = R.id.passwordLField;
      EditText passwordLField = ViewBindings.findChildViewById(rootView, id);
      if (passwordLField == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.usernameLField;
      EditText usernameLField = ViewBindings.findChildViewById(rootView, id);
      if (usernameLField == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, enterLoginButton,
          goBackMainLButton, passwordLField, textView3, usernameLField);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
