package org.bibletools.common.viewmodels

import org.bibletools.common.data.DataRepository
import org.bibletools.common.data.TakeModel

class TakeItemViewModel {
    val data = DataRepository()

    val onPlay: (TakeModel) -> Unit = {
        println("On Play Clicked on Take #${it.number}")
    }

    val onSelect: (TakeModel) -> Unit = {
        println("Take #${it.number} was selected")
    }
}
