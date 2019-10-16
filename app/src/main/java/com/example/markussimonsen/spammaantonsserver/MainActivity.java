package com.example.markussimonsen.spammaantonsserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int anton = 0;

    }
    long anton = 2;
    String antonStr = "0";
    public void spammlol(View view){
        anton += anton;
        antonStr = Long.toString(anton);
        TextView textView = (TextView)findViewById(R.id.texthaha);
        textView.setText(antonStr+" tryckningar");

    }
    public void reset(View view) {
        Button button = (Button) findViewById(R.id.button);
        anton = 2;
        antonStr = Long.toString(anton);
        TextView textView = (TextView) findViewById(R.id.texthaha);
        textView.setText(antonStr + " tryckningar");

    }
}