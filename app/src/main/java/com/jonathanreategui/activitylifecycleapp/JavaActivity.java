package com.jonathanreategui.activitylifecycleapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JavaActivity extends ComponentActivity {

    private static final String TAG = "Lifecycle-Java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "#1: onCreate called");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_xml);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "#2: onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "#3: onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "#4: onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "#5: onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "#6: onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "#7: onDestroy called");
    }
}
