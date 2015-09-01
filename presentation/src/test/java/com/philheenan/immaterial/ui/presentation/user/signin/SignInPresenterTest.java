package com.philheenan.immaterial.ui.presentation.user.signin;

import com.philheenan.immaterial.ui.presentation.PresentationBaseTest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Phil Heenan on 01/09/15.
 */
public class SignInPresenterTest extends PresentationBaseTest {

    @Mock
    SignInViewModel viewModel;

    @Inject
    SignInPresenter presenter;

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
}
