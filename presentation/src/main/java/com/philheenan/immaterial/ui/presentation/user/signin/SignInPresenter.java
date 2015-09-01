package com.philheenan.immaterial.ui.presentation.user.signin;

import com.philheenan.immaterial.lib.contract.Facet;
import com.philheenan.immaterial.ui.presentation.Presenter;
import com.philheenan.immaterial.user.User;

import javax.inject.Inject;

/**
 * @author Phil Heenan on 01/09/15.
 */
public class SignInPresenter implements Presenter<SignInViewModel> {

    @Inject
    Facet<User, Object> conductor;

    SignInViewModel viewModel;

    @Override
    public void bind(SignInViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void unbind() {
        this.viewModel = null;
    }

    public void signIn(String username, String password) {
        doSignIn(validateUser(username, password));
    }

    public void forgotPassword(String username) {

    }

    protected void doSignIn(User user) {
        if (user != null) {
            viewModel.processing(true);
            conductor.process(user);
        }
    }

    protected User validateUser(String username, String password) {
        User user = new User();
        if (isEmptyString(username)) {
            viewModel.showInvalidUsername();
            return null;
        } else {
            user.username = username;
        }
        if (isEmptyString(password)) {
            viewModel.showInvalidUsernamePassword();
            return null;
        } else {
            user.password = password;
        }

        return user;
    }

    private boolean isEmptyString(String input) {
        return input == null || input.length() == 0;
    }

}
