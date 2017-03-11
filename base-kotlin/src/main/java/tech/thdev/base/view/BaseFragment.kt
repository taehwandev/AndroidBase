package tech.thdev.base.view

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife

/**
 * Created by Tae-hwan on 9/5/16.
 */
abstract class BaseFragment : Fragment() {

    abstract fun getLayout(): Int
    @LayoutRes

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(getLayout(), container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.let {
            ButterKnife.bind(this@BaseFragment, it)
        }
    }
}