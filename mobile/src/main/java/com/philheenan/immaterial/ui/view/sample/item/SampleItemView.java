package com.philheenan.immaterial.ui.view.sample.item;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.philheenan.immaterial.ui.presentation.sample.item.SampleItemPresenter;
import com.philheenan.immaterial.ui.presentation.sample.item.SampleItemViewModel;

/**
 * @author Phil Heenan on 25/08/15.
 */
public class SampleItemView extends LinearLayout implements SampleItemViewModel {

    SampleItemPresenter presenter;

    public SampleItemView(Context context) {
        super(context);
        init();
    }

    public SampleItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SampleItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    public void setName(String text) {

    }

    @Override
    protected void onDetachedFromWindow() {
        presenter.unbind();
        super.onDetachedFromWindow();
    }

    private void init() {
        presenter.bind(this);
    }
}
