package org.fcitx.fcitx5.android.utils

import android.app.NotificationManager
import android.content.ClipboardManager
import android.content.Context
import android.os.Vibrator
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.getSystemService
import androidx.fragment.app.Fragment

val Context.clipboardManager
    get() = getSystemService<ClipboardManager>()!!

val Context.vibrator
    get() = getSystemService<Vibrator>()!!

val View.vibrator
    get() = context.vibrator

val Context.inputMethodManager
    get() = getSystemService<InputMethodManager>()!!

val Context.notificationManager
    get() = getSystemService<NotificationManager>()!!

val Fragment.notificationManager
    get() = requireContext().notificationManager
