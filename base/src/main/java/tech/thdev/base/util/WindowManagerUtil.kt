package tech.thdev.base.util

import android.graphics.PixelFormat
import android.view.Gravity
import android.view.View
import android.view.WindowManager

/**
 * Created by tae-hwan on 8/22/16.
 */
fun WindowManager.addWindowView(view: View?, xpos: Int, ypos: Int, alpah: Float = 1f): WindowManager.LayoutParams? {
    this.let {
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.x = xpos
        layoutParams.y = ypos
        layoutParams.alpha = alpah
        layoutParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ERROR
        layoutParams.flags =
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or
                        WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
        layoutParams.format = PixelFormat.TRANSLUCENT
        layoutParams.gravity = Gravity.TOP or Gravity.LEFT

        this.addView(view, layoutParams)

        return layoutParams
    }
}