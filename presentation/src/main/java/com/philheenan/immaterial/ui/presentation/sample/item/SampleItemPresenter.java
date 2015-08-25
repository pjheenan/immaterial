package com.philheenan.immaterial.ui.presentation.sample.item;

import com.philheenan.immaterial.ui.presentation.Presenter;

/**
 * @author Phil Heenan on 25/08/15.
 */
public class SampleItemPresenter implements Presenter<SampleItemViewModel> {

    SampleItemViewModel viewModel;

    @Override
    public void bind(SampleItemViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void unbind() {
        this.viewModel = null;
    }
}
