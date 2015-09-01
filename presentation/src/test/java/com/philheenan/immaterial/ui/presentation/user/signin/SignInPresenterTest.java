package com.philheenan.immaterial.ui.presentation.user.signin;

import com.philheenan.immaterial.lib.contract.Facet;
import com.philheenan.immaterial.ui.presentation.PresentationBaseTest;
import com.philheenan.immaterial.user.User;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

/**
 * @author Phil Heenan on 01/09/15.
 */
public class SignInPresenterTest extends PresentationBaseTest {

    @Mock
    SignInViewModel viewModel;

    @Inject
    SignInPresenter presenter;

    @Inject
    Facet<User, Object> mockFacet;

    @Before
    public void setup() {
        super.setup();
        MockitoAnnotations.initMocks(this);
        graph.inject(this);
        presenter.bind(viewModel);
    }

    @Test
    public void testSetup() {
        assertNotNull(presenter);
        assertNotNull(presenter.viewModel);
    }

    @Test
    public void testUnbind() {
        presenter.unbind();
        assertNull(presenter.viewModel);
    }

    @Test
    public void testSignIn_UsernameAndPassword() {
        User user = new User();
        user.username = "username";
        user.password = "password";
        presenter.signIn(user.username, user.password);

        verify(viewModel).processing(Matchers.eq(true));
        verify(mockFacet).process(eq(user));
    }

    @Test
    public void testSignIn_EmptyUsername() {
        User user = new User();
        user.username = "";
        user.password = "password";
        presenter.signIn(user.username, user.password);

        verify(viewModel).showInvalidUsername();
        verify(viewModel, never()).processing(anyBoolean());
        verify(mockFacet, never()).process(any(User.class));
    }
}
