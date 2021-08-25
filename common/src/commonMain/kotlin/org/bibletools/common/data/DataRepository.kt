package org.bibletools.common.data

class DataRepository {
    val takes = mutableListOf<TakeModel>()

    init {
        takes.addAll(
            listOf(
                TakeModel(false, 0f, 1),
                TakeModel(false, 0.6f, 2),
                TakeModel(false, 0f, 3),
                TakeModel(true, 0.2f, 4),
                TakeModel(false, 1f, 5),
                TakeModel(false, 0f, 6),
                TakeModel(false, 0f, 7),
                TakeModel(false, 0.7f, 8),
                TakeModel(false, 0.1f, 9),
                TakeModel(false, 0.4f, 10),
            )
        )
    }
}
