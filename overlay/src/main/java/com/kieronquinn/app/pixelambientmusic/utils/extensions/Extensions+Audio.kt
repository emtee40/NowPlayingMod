package com.kieronquinn.app.pixelambientmusic.utils.extensions

import java.nio.ByteBuffer
import java.nio.ByteOrder.LITTLE_ENDIAN

fun ByteArray.toShortArray(): ShortArray {
    return ShortArray(this.size / 2).apply {
        ByteBuffer.wrap(this@toShortArray)
            .order(LITTLE_ENDIAN).asShortBuffer()[this]
    }
}

fun ShortArray.applyGain(gain: Float): ShortArray {
    if (isNotEmpty()) {
        for (i in indices) {
            this[i] = (this[i] * gain).toInt().coerceAtMost(Short.MAX_VALUE.toInt()).toShort()
        }
    }
    return this
}