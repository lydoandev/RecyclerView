package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.listAnimals);
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));

        final ArrayList<Student> studentList = new ArrayList<Student>(10);

        Student student1 = new Student("Ly", 10);
        Student student2 = new Student("Mai", 8);
        Student student3 = new Student("Hoa", 7);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        final StudentAdapter adapter = new StudentAdapter();
        adapter.studentList = studentList;
        rvAnimals.setAdapter(adapter);

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name, score;
                name = findViewById(R.id.name);
                score = findViewById(R.id.score);
                Student student = new Student(name.getText().toString(), Integer.parseInt(score.getText().toString()));
                studentList.add(student);
                name.setText("");
                score.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }
}
