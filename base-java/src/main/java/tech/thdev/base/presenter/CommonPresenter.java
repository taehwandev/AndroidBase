package tech.thdev.base.presenter;

/**
 * Created by tae-hwan on 5/6/17.
 */

public abstract class CommonPresenter<VIEW extends BaseView> implements BasePresenter<VIEW> {

    protected VIEW view;

    @Override
    public void attachView(VIEW view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    protected boolean isDetached() {
        return view != null && view.isNotFinish();
    }
}
