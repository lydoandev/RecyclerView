package com.example.numberlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNumberList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumberList = findViewById(R.id.rvNumberList);

        rvNumberList.setLayoutManager(new LinearLayoutManager(this));

        NumberAdapter adapter = new NumberAdapter();

        rvNumberList.setAdapter(adapter);
    }
}
