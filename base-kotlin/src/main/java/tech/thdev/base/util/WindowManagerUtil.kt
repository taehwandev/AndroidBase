package tech.thdev.base.util

import android.graphics.PixelFormat
import android.view.View
import android.view.WindowManager

/**
 * Created by tae-hwan on 8/22/16.
 */

@JvmOverloads fun WindowManager.addWindowView(
        view: View?,
        width: Int = WindowManager.LayoutParams.WRAP_CONTENT,
        height: Int = WindowManager.LayoutParams.WRAP_CONTENT,
        xPos: Int,
        yPos: Int,
        type: Int,
        flags: Int = WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
        format: Int = PixelFormat.TRANSLUCENT,
        gravity: Int,
        alpha: Float = 1f): WindowManager.LayoutParams? {
    val layoutParams = WindowManager.LayoutParams().apply {
        this.width = width
        this.height = height
        this.x = xPos
        this.y = yPos
        this.alpha = alpha
        this.type = type
        this.flags = flags
        this.format = format
        this.gravity = gravity
    }
    this.addView(view, layoutParams)

    return layoutParams
}