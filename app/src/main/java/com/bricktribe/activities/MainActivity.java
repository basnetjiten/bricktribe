package com.bricktribe.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.bricktribe.DrawerUtil;
import com.bricktribe.R;

public class MainActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolBar= findViewById(R.id.toolbar);
        DrawerUtil.getDrawer(this,toolBar);
    }
}
