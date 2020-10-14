package com.example.helloworld.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

/**
 * @author Prongs
 */
public class GridRecyclerActivity extends AppCompatActivity {

    private RecyclerView rvGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler);
        rvGrid = findViewById(R.id.rv_grid);
        rvGrid.setLayoutManager(new GridLayoutManager(GridRecyclerActivity.this, 3));
        rvGrid.setAdapter(new GridAdapter(GridRecyclerActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridRecyclerActivity.this, "click:" + pos, Toast.LENGTH_SHORT).show();
            }
        }));
    }
}