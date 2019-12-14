package com.madantiwari.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnshowall,btnregister,btnsearch,btnupdate_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnshowall = findViewById(R.id.showAllEmployee);
        btnregister = findViewById(R.id.registerEmployee);
        btnsearch = findViewById(R.id.searchEmployee);
        btnupdate_delete = findViewById(R.id.updateDeteleEmployee);

        btnshowall.setOnClickListener(this);
        btnregister.setOnClickListener(this);
        btnsearch.setOnClickListener(this);
        btnupdate_delete.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()){
            case R.id.showAllEmployee:
                intent = new Intent(MainActivity.this, DisplayActivity.class);
                startActivity(intent);
                break;
            case R.id.registerEmployee:
                intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.searchEmployee:
                 intent = new Intent(MainActivity.this, SearchByIdActivity.class);
                startActivity(intent);
                break;
            case R.id.updateDeteleEmployee:
                 intent = new Intent(MainActivity.this, UpdateDeleteActivity.class);
                startActivity(intent);
                break;
        }


    }
}
