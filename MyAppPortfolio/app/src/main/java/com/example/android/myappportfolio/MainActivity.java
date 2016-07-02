package com.example.android.myappportfolio;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonaction(View v) {
        Button b = (Button)v;
        Context c = getApplicationContext();
        CharSequence text = "this button will be used for "+b.getText().toString().toLowerCase()+" app";
        int time = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(c, text, time);
        t.show();

    }


}