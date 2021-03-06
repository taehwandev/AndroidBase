package tech.thdev.sample.presenter;

import tech.thdev.base.presenter.BasePresenter;
import tech.thdev.base.presenter.BaseView;

/**
 * Created by Tae-hwan on 9/1/16.
 */

public interface MainContract {

    interface View extends BaseView {

        void showMessage(String message);
    }

    interface Presenter extends BasePresenter<View> {

        void updateMessage();
    }
}
