package tech.thdev.base.view

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Tae-hwan on 9/5/16.
 */
abstract class BaseFragment : Fragment() {

    @LayoutRes protected abstract fun getLayoutResource(): Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?)
            = inflater?.inflate(getLayoutResource(), container, false)
}