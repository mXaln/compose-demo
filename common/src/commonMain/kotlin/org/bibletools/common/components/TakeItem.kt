package org.bibletools.common.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.bibletools.common.data.TakeModel

@Composable
fun TakeItem(item: TakeModel, onPlay: (TakeModel) -> Unit, onSelect: (TakeModel) -> Unit) {
    val play = Icons.Default.PlayArrow
    val pause = Icons.Default.Pause

    val take by remember { mutableStateOf(item) }
    val (selected, setSelected) = remember { mutableStateOf(take.selected) }
    val (position, setPosition) = remember { mutableStateOf(take.position) }
    val (isPlaying, setIsPlaying) = remember { mutableStateOf(false) }

    Row(
        Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = {
                setIsPlaying(!isPlaying)
                onPlay(take)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xfff3f2f5),
                contentColor = Color(0xff222222)
            ),
            border = BorderStroke(2.dp, Color(0xffdadde2)),
            modifier = Modifier.size(48.dp),
            shape = RoundedCornerShape(6.dp)
        ) {
            Icon(
                if (isPlaying) pause else play,
                "Play",
                Modifier.scale(1.2f)
            )
        }
        Slider(
            onValueChange = { setPosition(it) },
            value = position,
            colors = SliderDefaults.colors(
                thumbColor = Color(0xff166fea),
                activeTrackColor = Color(0xff166fea),
                inactiveTrackColor = Color(0xffdadde2)
            ),
            modifier = Modifier.width(400.dp)
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(6.dp))
                .background(Color(0xfff3f2f5), RoundedCornerShape(6.dp))
                .border(BorderStroke(2.dp, Color(0xffdadde2)), RoundedCornerShape(6.dp))
                .size(48.dp),
            contentAlignment = Alignment.Center
        ) {
            RadioButton(
                selected = selected,
                onClick = {
                    setSelected(!selected)
                    onSelect(take)
                },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color(0xff166fea)
                )
            )
        }
    }
}
