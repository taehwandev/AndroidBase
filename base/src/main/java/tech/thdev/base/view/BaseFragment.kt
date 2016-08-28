package tech.thdev.base.view

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import tech.thdev.base.presenter.BasePresenter
import tech.thdev.base.presenter.BaseView

/**
 * Created by tae-hwan on 8/28/16.
 */
abstract class BaseFragment<P : BasePresenter<*>>() : android.support.v4.app.Fragment(), BaseView<P> {

    protected var presenter: P? = null
        private set

    abstract fun getLayout(): Int
    @LayoutRes

    override fun onPresenter(presenter: P) {
        this.presenter = presenter
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(getLayout(), container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.let {
            ButterKnife.bind(this@BaseFragment, it)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter?.detachView()
    }
}