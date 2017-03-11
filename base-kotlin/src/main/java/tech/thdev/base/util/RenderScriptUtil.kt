package tech.thdev.base.util

import android.content.Context
import android.graphics.Bitmap
import android.support.v8.renderscript.Allocation
import android.support.v8.renderscript.Element
import android.support.v8.renderscript.RenderScript
import android.support.v8.renderscript.ScriptIntrinsicBlur

/**
 * Created by Tae-hwan on 9/5/16.
 *
 * Android RenderScript util.
 */

/**
 * Create blur image - half size
 */
fun Bitmap?.createBlurImage(context: Context, radius: Float = 25.0f): Bitmap? {
    return this?.let {
        createBlurImage(context, it.width / 2, it.height / 2, radius)
    }
}

/**
 * Create blur image
 */
fun Bitmap?.createBlurImage(context: Context, dstWidth: Int, dstHeight: Int, radius: Float = 25.0f): Bitmap? {
    return this?.let {
        val temp = getRadius(radius)

        val bitmap: Bitmap = Bitmap.createScaledBitmap(this, dstWidth, dstHeight, false)

        val renderScript: RenderScript = RenderScript.create(context)

        val blurInput: Allocation = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, Allocation.USAGE_SCRIPT)
        val blurOutput: Allocation = Allocation.createTyped(renderScript, blurInput.type)

        val blur: ScriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript))

        // Set the radius of the Blur. Supported range 0 < radius <= 25
        blur.setRadius(temp)
        blur.setInput(blurInput)
        blur.forEach(blurOutput)

        blurOutput.copyTo(bitmap)
        renderScript.destroy()

        return bitmap
    }
}

private fun getRadius(radius: Float): Float {
    if (radius < 0) {
        return 0f

    } else if (radius > 25.0f) {
        return 25.0f
    }

    return radius
}