package tech.thdev.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import tech.thdev.base.presenter.BasePresenter;
import tech.thdev.base.presenter.BaseView;

/**
 * Created by tae-hwan on 5/6/17.
 */

public abstract class BasePresenterFragment<VIEW extends BaseView, P extends BasePresenter<VIEW>> extends BaseFragment implements BaseView {

    protected P presenter;

    protected abstract P onCreatePresenter();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = onCreatePresenter();
        presenter.attachView((VIEW) this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public boolean isNotFinish() {
        return !getActivity().isFinishing();
    }
}
