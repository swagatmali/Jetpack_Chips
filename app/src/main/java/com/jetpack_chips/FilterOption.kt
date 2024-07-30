package com.jetpack_chips

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class FilterOption(val option: String, val statement:String, initialSelection: Boolean = false) {
    var selected by mutableStateOf(initialSelection)
}
