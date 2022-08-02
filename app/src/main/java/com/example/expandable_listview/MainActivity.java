package com.example.expandable_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandableListView=(ExpandableListView) findViewById(R.id.listview);
        expandableListView.setAdapter(new MyExpandableListAdapter(this));

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                Toast.makeText(MainActivity.this, "clicked group="+i+ "child= "+i1, Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }
}