package com.philheenan.immaterial.ui.presentation;

import com.philheenan.immaterial.lib.contract.Facet;
import com.philheenan.immaterial.ui.presentation.user.signin.SignInPresenterTest;
import com.philheenan.immaterial.user.User;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 01/09/15.
 */
@Module(
        complete = false,
        library = true,
        addsTo = PresentationModule.class,
        overrides = true,
        injects = {
                SignInPresenterTest.class
        }
)
public class PresentationTestModule {

    @Provides
    @Singleton
    @SuppressWarnings("unchecked")
    Facet<User, Object> provideSignInConductor() {
        return Mockito.mock(Facet.class);
    }
}
