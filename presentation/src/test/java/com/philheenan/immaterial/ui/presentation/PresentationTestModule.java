package com.philheenan.immaterial.ui.presentation;

import com.philheenan.immaterial.lib.contract.Facet;
import com.philheenan.immaterial.ui.presentation.user.signin.SignInPresenterTest;

import org.mockito.Mockito;

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
    @SuppressWarnings("unchecked")
    Facet<Object, Object> provideEmptyFacet() {
        return Mockito.mock(Facet.class);
    }
}
