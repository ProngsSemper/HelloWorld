package com.example.helloworld;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Prongs
 */
public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox cb5,cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        cb5 = findViewById(R.id.cb_5);
        cb6 = findViewById(R.id.cb_6);
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?"5选中":"5未选中",Toast.LENGTH_SHORT).show();;
            }
        });

        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?"6选中":"6未选中",Toast.LENGTH_SHORT).show();;
            }
        });
    }
}