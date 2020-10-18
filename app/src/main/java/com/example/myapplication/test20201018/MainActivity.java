package com.example.myapplication.test20201018;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import com.example.myapplication.R;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmain);
        ConstraintLayout background=findViewById(R.id.main);
        background.setBackgroundColor(ContextCompat.getColor(this,R.color.black));
        TextView home = findViewById(R.id.home);
        home.setText("house");
        home.setTextColor(ContextCompat.getColor(this, R.color.deepGreen));
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","onClick");
            }
        });
        ImageView image = findViewById(R.id.image);
        image.setImageResource(R.drawable.notebookred);




        setName();
        setName("jess");
        setNumber();
        github();
    }

    @Override
    public void github() {
        System.out.println("gitHub");
        Log.d("MainActivity", "onCreat" + "gitHub");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }
}
