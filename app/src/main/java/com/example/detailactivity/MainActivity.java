package com.example.detailactivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvDate, tvDepartment, tvBorrower, tvProjectName, tvTime, tvVenue, tvItems;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize views
        tvDate = findViewById(R.id.tvDate);
        tvDepartment = findViewById(R.id.tvDepartment);
        tvBorrower = findViewById(R.id.tvBorrower);
        tvProjectName = findViewById(R.id.tvProjectName);
        tvTime = findViewById(R.id.tvTime);
        tvVenue = findViewById(R.id.tvVenue);
        tvItems = findViewById(R.id.tvItems);

        // Load data from SharedPreferences
        SharedPreferences prefs = getSharedPreferences("permit_data", MODE_PRIVATE);

        String date = prefs.getString("date", null);
        String department = prefs.getString("department", null);
        String borrower = prefs.getString("borrowerName", null);
        String project = prefs.getString("projectName", null);
        String time = prefs.getString("time", null);
        String venue = prefs.getString("venue", null);
        String items = prefs.getString("items", null);  // this should be a pre-formatted string

        if (date == null || borrower == null || items == null) {
            Toast.makeText(this, "No request data found.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Set data to views
        tvDate.setText(date);
        tvDepartment.setText(department);
        tvBorrower.setText(borrower);
        tvProjectName.setText(project);
        tvTime.setText(time);
        tvVenue.setText(venue);
        tvItems.setText(items);
    }
}


