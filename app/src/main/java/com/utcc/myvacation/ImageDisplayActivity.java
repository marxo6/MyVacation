package com.utcc.myvacation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.utcc.myvacation.Adapter.ImageAdapter;

public class ImageDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        Intent i = getIntent();
        int pos = i.getExtras().getInt("itemId");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageHolder = (ImageView) findViewById(R.id.imageHolder);
        TextView imageId = (TextView) findViewById(R.id.imageId);

        imageId.setText("Id : " + (pos + 1));
        imageHolder.setImageResource(imageAdapter.mThumbIds[pos]);
    }
}