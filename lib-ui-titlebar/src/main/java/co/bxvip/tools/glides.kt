package co.bxvip.tools

import android.content.Context
import android.graphics.drawable.Drawable
import com.bumptech.glide.request.animation.GlideAnimation
import com.bumptech.glide.request.target.SimpleTarget
import java.lang.Exception

/** glide 加载图片*/
fun setGlideBgDrawble(ctx: Context, url: String, succ: (resource: Drawable?) -> Unit, noSucc: () -> Unit) {
    if (url.isEmpty()) noSucc() else ImageLoader.loadGlideTarget(ctx, url, object : SimpleTarget<Drawable>() {
        override fun onResourceReady(it: Drawable?, glideAnimation: GlideAnimation<in Drawable>?) {
            if (it!=null) succ(it) else noSucc()
        }

        override fun onLoadFailed(e: Exception?, errorDrawable: Drawable?) {
            noSucc()
        }
    })
}