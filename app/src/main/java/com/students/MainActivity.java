package com.students;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onBtnShowGroupsClick(View view) {
        Intent intent = new Intent(this, GroupsListActivity.class);
        startActivity(intent);
        }
}