package com.jetpack_chips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.jetpack_chips.ui.theme.Jetpack_ChipsTheme

val filterOptions = DummyData.getFilterOptions()
//https://github.com/kamydeep00178/ComposeChips
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack_ChipsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SingleSelectScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}