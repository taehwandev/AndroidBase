package tech.thdev.base.presenter

/**
 * Created by tae-hwan on 8/17/16.
 */
abstract class CommonPresenter<VIEW : BaseView> : BasePresenter<VIEW> {

    protected lateinit var view: VIEW
        private set

    private var isDetach = true

    override fun attachView(view: VIEW) {
        this.view = view
        isDetach = false
    }

    override fun detachView() {
        isDetach = true
    }

    /**
     * is Detach?
     */
    protected fun isDetach() = !isDetach and view.isNotFinish()
}