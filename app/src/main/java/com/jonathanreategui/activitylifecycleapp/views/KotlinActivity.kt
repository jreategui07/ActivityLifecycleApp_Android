package com.jonathanreategui.activitylifecycleapp.views

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jonathanreategui.activitylifecycleapp.R

class KotlinActivity : ComponentActivity() {

    private val TAG: String = "Lifecycle-Kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        Log.d(TAG, "#1: onCreate called")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
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
