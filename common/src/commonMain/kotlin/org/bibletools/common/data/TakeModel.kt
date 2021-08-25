package org.bibletools.common.data

data class TakeModel(
    var selected: Boolean,
    var position: Float,
    val number: Int,
    var onPlay: () -> Unit = {},
    var onSelect: () -> Unit = {}
)
