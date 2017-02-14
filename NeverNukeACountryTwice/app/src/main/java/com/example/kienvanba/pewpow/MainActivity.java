package com.example.kienvanba.pewpow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.kienvanba.pewpow.widget.WanaKanaJavaText;

public class MainActivity extends AppCompatActivity {
    private EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        WanaKanaJavaText waka = new WanaKanaJavaText(et,false);
        waka.bind();
    }
}
