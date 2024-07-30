package com.jetpack_chips

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FilterChip(
    filterOption: FilterOption,
    selected: Boolean? = null,
    onChipClick: (FilterOption) -> Unit
) {

    FilterChip(
        onClick = { onChipClick(filterOption) },
        label = {
            Text(filterOption.option)
        },
        selected = selected ?: filterOption.selected,
    )
}
