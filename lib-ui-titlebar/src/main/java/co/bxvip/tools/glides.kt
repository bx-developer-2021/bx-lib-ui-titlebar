package co.bxvip.tools

import android.content.Context
import android.graphics.drawable.Drawable
import com.bumptech.glide.request.animation.GlideAnimation
import com.bumptech.glide.request.target.SimpleTarget

/** glide 加载图片*/
fun setGlideBgDrawable(
        ctx: Context, url: String,
        onSuccess: (resource: Drawable?) -> Unit,
        onFailed: () -> Unit
) {
    if (url.isEmpty()) onFailed() else ImageLoader.loadGlideTarget(ctx, url, object : SimpleTarget<Drawable>() {
        override fun onResourceReady(it: Drawable?, glideAnimation: GlideAnimation<in Drawable>?) {
            if (it != null) onSuccess(it) else onFailed()
        }

        override fun onLoadFailed(e: Exception?, errorDrawable: Drawable?) {
            onFailed()
        }
    })
}