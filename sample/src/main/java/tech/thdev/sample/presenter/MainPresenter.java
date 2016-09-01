package tech.thdev.sample.presenter;

import tech.thdev.base.presenter.AbstractPresenter;

/**
 * Created by Tae-hwan on 9/1/16.
 */

public class MainPresenter extends AbstractPresenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void attachView(MainContract.View view) {
        super.attachView(view);

        view.onPresenter(this);
    }
}
