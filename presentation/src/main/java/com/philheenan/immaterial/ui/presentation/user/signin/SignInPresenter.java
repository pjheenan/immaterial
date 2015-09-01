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
        doSignIn(username, password);
    }

    public void forgotPassword(String username) {

    }

    protected void doSignIn(String username, String password) {
        viewModel.processing(true);
        User user = new User();
        user.username = username;
        user.password = password;
        conductor.process(user);
    }

}
