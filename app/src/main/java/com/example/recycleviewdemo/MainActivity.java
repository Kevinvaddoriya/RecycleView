package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactList> arrayList = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        arrayList.add(new ContactList(R.drawable.xavier,"Xavier","989565563"));
        RecycleContectAdapter adapter = new RecycleContectAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);

    }
}