package tech.thdev.base.view

import android.os.Bundle
import tech.thdev.base.presenter.BasePresenter
import tech.thdev.base.presenter.BaseView

/**
 * Created by Tae-hwan on 9/5/16.
 */
abstract class BasePresenterActivity<in VIEW: BaseView, P : BasePresenter<VIEW>> : BaseActivity(), BaseView {

    protected lateinit var presenter: P
        private set

    abstract fun onCreatePresenter(): P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = onCreatePresenter()
        presenter.attachView(this as VIEW)
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter.detachView()
    }

    override fun isNotFinish() = !isFinishing
}
