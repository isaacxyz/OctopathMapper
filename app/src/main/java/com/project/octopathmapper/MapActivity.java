package com.project.octopathmapper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.navigation.ui.AppBarConfiguration;
import android.view.View;
import android.widget.Toolbar;

import com.project.octopathmapper.databinding.ActivityMapBinding;


import com.google.android.material.appbar.MaterialToolbar;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        setTitle("Map");
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);

        TextView textView = new TextView(this);
        textView.setText(title);
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(textView);
    }
}