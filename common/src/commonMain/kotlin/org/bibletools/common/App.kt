package org.bibletools.common
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.bibletools.common.components.TakeItem
import org.bibletools.common.viewmodels.TakeItemViewModel

@Composable
fun MainView() {
    MaterialTheme {
        val viewModel = TakeItemViewModel()

        LazyColumn {
            items(items = viewModel.data.takes, itemContent = { item ->
                TakeItem(item, viewModel.onPlay, viewModel.onSelect)
            })
        }
    }
}
