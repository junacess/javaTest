package com.example.myapplication.test20201011;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private String tag="MainActivity20201011";

    private String name = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrainlayout);
        ImageView greenPerson=findViewById(R.id.greenPerson);
        greenPerson.setImageResource(R.drawable.notebookred);
        greenPerson.setVisibility(View.GONE);


    }

    @Override
    protected void onStart() {
        super.onStart();
        name = "Jack";
        Log.d("MainActivity20201011","onStart " + name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy");
    }
}
