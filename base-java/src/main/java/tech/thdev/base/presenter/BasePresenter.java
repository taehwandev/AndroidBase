package tech.thdev.base.presenter;

/**
 * Created by tae-hwan on 5/6/17.
 */

public interface BasePresenter<VIEW extends BaseView> {

    void attachView(VIEW view);

    void detachView();
}
