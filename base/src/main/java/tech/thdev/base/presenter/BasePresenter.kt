package tech.thdev.base.presenter

/**
 * Created by tae-hwan on 8/17/16.
 */
interface BasePresenter<in VIEW : BaseView> {

    /**
     * View Attach.
     */
    fun attachView(view: VIEW)

    /**
     * View detach
     */
    fun detachView()
}