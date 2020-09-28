package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.listview.ListViewActivity;

/**
 * @author Prongs
 */
public class MainActivity extends AppCompatActivity {

    private Button btnTextView;

    private Button button;

    private Button et;

    private Button rb;

    private Button cb;

    private Button im;

    private Button lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTextView = findViewById(R.id.btn_1);

        button = findViewById(R.id.btn_2);


        et = findViewById(R.id.btn_edittext);

        rb = findViewById(R.id.btn_radiobtn);
        cb = findViewById(R.id.btn_checkbox);
        im = findViewById(R.id.btn_imageview);
        lv = findViewById(R.id.btn_listview);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        btnTextView.setOnClickListener(onClick);
        button.setOnClickListener(onClick);
        et.setOnClickListener(onClick);
        rb.setOnClickListener(onClick);
        cb.setOnClickListener(onClick);
        im.setOnClickListener(onClick);
        lv.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_1:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn2:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobtn:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                default:
                    break;

            }
            startActivity(intent);
        }
    }
}