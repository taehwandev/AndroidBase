package tech.thdev.base.util

import android.graphics.PixelFormat
import android.view.View
import android.view.WindowManager

/**
 * Created by tae-hwan on 8/22/16.
 */

fun WindowManager.addWindowView(view: View?,
                                xPos: Int, yPos: Int,
                                type: Int,
                                gravity: Int,
                                alpha: Float = 1f)
        = this.addWindowView(view,
        xPos, yPos,
        type, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
        gravity, alpha)

fun WindowManager.addWindowView(view: View?,
                                xPos: Int, yPos: Int,
                                type: Int, flags: Int,
                                gravity: Int,
                                alpha: Float = 1f)
        = this.addWindowView(view,
        WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT,
        xPos, yPos,
        type, flags, gravity, alpha)

fun WindowManager.addWindowView(view: View?,
                                width: Int, height: Int,
                                xPos: Int, yPos: Int,
                                type: Int, flags: Int,
                                gravity: Int,
                                alpha: Float = 1f)
        = this.addWindowView(view,
        width, height,
        xPos, yPos,
        type, flags, PixelFormat.TRANSLUCENT, gravity, alpha)

fun WindowManager.addWindowView(view: View?,
                                width: Int, height: Int,
                                xPos: Int, yPos: Int,
                                type: Int, flags: Int,
                                format: Int, gravity: Int,
                                alpha: Float = 1f): WindowManager.LayoutParams? {
    this.let {
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.width = width
        layoutParams.height = height
        layoutParams.x = xPos
        layoutParams.y = yPos
        layoutParams.alpha = alpha
        layoutParams.type = type
        layoutParams.flags = flags
        layoutParams.format = format
        layoutParams.gravity = gravity

        this.addView(view, layoutParams)

        return layoutParams
    }
}