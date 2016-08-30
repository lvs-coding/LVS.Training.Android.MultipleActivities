package com.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        Log.i("Data received",i.getStringExtra("nameClicked"));
    }

    public void goBackFirstActivity(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);

        startActivity(i);
    }
}
