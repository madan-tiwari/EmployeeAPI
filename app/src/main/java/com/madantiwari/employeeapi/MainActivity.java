package com.madantiwari.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnshowall,btnregister,btnsearch,btnupdate_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnshowall = findViewById(R.id.showAllEmployee);
        btnregister = findViewById(R.id.registerEmployee);
        btnsearch = findViewById(R.id.searchEmployee);
        btnupdate_delete = findViewById(R.id.updateDeteleEmployee);

        btnshowall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
