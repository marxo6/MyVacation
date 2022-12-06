package com.utcc.myvacation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.utcc.myvacation.Adapter.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView vacationGird = (GridView) findViewById(R.id.vacationImages);
        vacationGird.setAdapter(new ImageAdapter(this));

        vacationGird.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showImage = new Intent(MainActivity.this, ImageDisplayActivity.class);
                showImage.putExtra("itemId", i);
                startActivity(showImage);
            }
        });
    }
}