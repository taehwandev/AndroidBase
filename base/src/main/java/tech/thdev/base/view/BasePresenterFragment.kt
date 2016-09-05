package tech.thdev.base.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tech.thdev.base.presenter.BasePresenter
import tech.thdev.base.presenter.BaseView

/**
 * Created by tae-hwan on 8/28/16.
 */
abstract class BasePresenterFragment<in VIEW : BaseView, P : BasePresenter<VIEW>> : BaseFragment() {

    protected var presenter: P? = null
        private set

    abstract fun onCreatePresenter(): P?

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        presenter = onCreatePresenter()
        presenter?.attachView(this as VIEW)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter?.detachView()
    }
}