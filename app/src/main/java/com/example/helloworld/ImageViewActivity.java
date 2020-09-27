package com.example.helloworld;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

/**
 * @author Prongs
 */
public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv = findViewById(R.id.iv_4);
        Glide.with(this).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(mIv);
    }
}