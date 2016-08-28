package tech.thdev.base.util

import android.app.Activity
import android.app.Fragment
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.annotation.IdRes

/**
 * Created by tae-hwan on 8/17/16.
 */
fun Activity.setContentFragment(@IdRes frameId: Int, fragment: Fragment) {
    fragmentManager?.beginTransaction()?.replace(frameId, fragment)?.commit()
}

fun <E> Context?.startServiceClass(cls: Class<E>?) {
    this?.let {
        val intent = Intent(it, cls)
        it.startService(intent)
    }
}

fun <E> Context?.stopServiceClass(cls: Class<E>?) {
    this?.let {
        val intent = Intent(it, cls)
        it.stopService(intent)
    }
}

fun Context?.registerReceiverAction(broadcastReceiver: BroadcastReceiver, actionList: List<String>? = null) {
    this?.let {
        val intentFilter = IntentFilter()
        actionList?.filterNotNull()?.forEach { intentFilter.addAction(it) }
        it.registerReceiver(broadcastReceiver, intentFilter)
    }
}
