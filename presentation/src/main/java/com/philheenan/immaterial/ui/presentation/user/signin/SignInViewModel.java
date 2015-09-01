package com.philheenan.immaterial.ui.presentation.user.signin;

import com.philheenan.immaterial.ui.presentation.ViewModel;

/**
 * @author Phil Heenan on 01/09/15.
 */
public interface SignInViewModel extends ViewModel {

    void showInvalidUsername();
    void showInvalidUsernamePassword();

}
