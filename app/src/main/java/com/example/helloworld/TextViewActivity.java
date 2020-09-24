package com.example.helloworld;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Prongs
 */
public class TextViewActivity extends AppCompatActivity {

    private TextView tv3;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_viw);
        tv3 = findViewById(R.id.tv_3);
        tv3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        //去除锯齿
        tv3.getPaint().setAntiAlias(true);

        tv4 = findViewById(R.id.tv_4);
        //下划线
        tv4.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}