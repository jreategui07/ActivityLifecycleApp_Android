package com.jonathanreategui.activitylifecycleapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jonathanreategui.activitylifecycleapp.ui.theme.ActivityLifecycleAppTheme

class ComposeActivity : ComponentActivity() {

    private val TAG: String = "Lifecycle-Compose"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "#1: onCreate called")
        enableEdgeToEdge()
        setContent {
            ActivityLifecycleAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeLifecycleScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "#2: onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "#3: onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "#4: onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "#5: onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "#6: onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "#7: onDestroy called")
    }
}

@Composable
fun ComposeLifecycleScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Compose Lifecycle Activity!",
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeLifecycleScreenPreview() {
    ActivityLifecycleAppTheme {
        ComposeLifecycleScreen()
    }
}