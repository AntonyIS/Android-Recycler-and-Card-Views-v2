package com.injila.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {
    private TextView title,description,category;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        Intent intent= getIntent();

        title = findViewById(R.id.title_tv_id);
        description = findViewById(R.id.description_tv_id);
        category= findViewById(R.id.tv_category);
        img = findViewById(R.id.bookthumbnail);

        String Title = getIntent().getExtras().getString("Title");
        String Category = getIntent().getExtras().getString("Category");
        String Description = getIntent().getExtras().getString("Description");
        int image = getIntent().getExtras().getInt("Thumbnail");



         title.setText(Title);
         category.setText(Category);
         description.setText(Description);
         img.setImageResource(image);
    }
}
