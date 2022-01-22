package com.project.octopathmapper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.media.MediaPlayer;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.MotionEvent;

import androidx.constraintlayout.widget.ConstraintSet;
import androidx.navigation.ui.AppBarConfiguration;
import android.view.View;
import android.widget.Toolbar;



import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.project.octopathmapper.databinding.ActivityMapBinding;


public class MapActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMapBinding binding;


            //These scrollview overrides are currently commented out because of scroll jitter issues. keeping for future use and continued testing
//
//    ScrollView scrollY;
//    HorizontalScrollView scrollYChild;

        //MediaPlayer mPlayer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            //media player throwing exception when returning to previous activity
//            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thegateoffinis);
//            mPlayer.start();

//        These scroll declarations are also out of use due to scroll issues
//
//        scrollY = (ScrollView)findViewById(R.id.svVertical);
//        scrollYChild = (HorizontalScrollView)findViewById(R.id.hsvHorizontal);


            //setContentView(R.layout.activity_map); set content view commented, replaced by binding. still testing
            binding = ActivityMapBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());


            //getWindow function only necessary for activity to successfully run on older SDK versions (with "hide status bar"). Keeping for testing purposes
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);


            setTitle("Map");

            binding.boulderfall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderfall.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.swarkii.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderfall... Is it though?", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.flamesgrace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderfall... Ok not really.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.atlasdam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderfall... Just kidding!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.rippletide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderfall... That's enough of the shenanigans.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.cobbleston.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Bouldersmall.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.clearbrook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderwall.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            binding.sunshade.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "This is Boulderbrawl.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }

        //media player throwing exception when returning to previous activity
//        @Override
//        protected void onPause() {
//            super.onPause();
//            mPlayer.stop();
//            mPlayer.release();
//            mPlayer.setLooping(true);
//        }

        //This entire function is out of commission because it is linked to the scrollview declarations
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        scrollYChild.dispatchTouchEvent(event);
//        scrollY.onTouchEvent(event);
//        return super.dispatchTouchEvent(event);
//    }

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