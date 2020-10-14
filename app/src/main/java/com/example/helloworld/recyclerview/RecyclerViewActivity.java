package com.example.helloworld.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

/**
 * @author Prongs
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private Button btnLinear;
    private Button btnHor;
    private Button btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        btnLinear = findViewById(R.id.btn_linear);
        btnHor = findViewById(R.id.btn_hor);
        btnGrid = findViewById(R.id.btn_grid);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        btnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,HorRecyclerActivity.class);
                startActivity(intent);
            }
        });
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,GridRecyclerActivity.class);
                startActivity(intent);
            }
        });
    }
}