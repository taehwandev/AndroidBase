package tech.thdev.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import tech.thdev.base.presenter.BasePresenter;
import tech.thdev.base.presenter.BaseView;

/**
 * Created by tae-hwan on 5/6/17.
 */

public abstract class BasePresenterActivity<VIEW extends BaseView, P extends BasePresenter<VIEW>> extends BaseActivity implements BaseView {

    protected P presenter;

    protected abstract P onCreatePresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = onCreatePresenter();
        presenter.attachView((VIEW) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public boolean isNotFinish() {
        return !isFinishing();
    }
}
