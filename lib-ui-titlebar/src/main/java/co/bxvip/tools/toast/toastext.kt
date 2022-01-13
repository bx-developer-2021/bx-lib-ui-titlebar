package co.bxvip.tools.toast

import android.app.Activity
import android.content.Context

@Suppress("unused")
fun Activity.toastMe(message: CharSequence?) {
    if (message != null && message.isNotEmpty() && message.isNotBlank()) {
        ToastUtils.show(message)
    }
}

@Suppress("unused")
fun Context.toastMe(message: CharSequence?) {
    if (message != null && message.isNotEmpty() && message.isNotBlank()) {
        ToastUtils.show(message)
    }
}

