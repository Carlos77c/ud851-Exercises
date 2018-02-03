package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// COMPLETED (1) Use Android Studio's Activity wizard to create a new Activity called ChildActivity
public class ChildActivity extends AppCompatActivity {


    // Do steps 6 & 7 in ChildActivity.java
    // COMPLETED (6) Create a TextView field to display your message
    TextView mDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        // COMPLETED (7) Get a reference to your TextView in Java
        mDisplayTextView = findViewById(R.id.tv_display);
    }
}
