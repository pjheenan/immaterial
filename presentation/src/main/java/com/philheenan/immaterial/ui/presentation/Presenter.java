package com.philheenan.immaterial.ui.presentation;

/**
 * @author Phil Heenan on 25/08/15.
 */
public interface Presenter<T> {

    void bind(T viewModel);
    void unbind();
}
