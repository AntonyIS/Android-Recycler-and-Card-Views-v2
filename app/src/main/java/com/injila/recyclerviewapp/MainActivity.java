package com.injila.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> listBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listBook = new ArrayList<>();

        listBook.add(new Book( "Javascript","Client side","JavaScript is a scripting language used to create and control dynamic website content, i.e. anything that moves, refreshes, or otherwise changes on your screen without requiring you to manually reload a web page",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Client side","JavaScript is a scripting language used to create and control dynamic website content, i.e. anything that moves, refreshes, or otherwise changes on your screen without requiring you to manually reload a web page",R.mipmap.wildone));
        listBook.add(new Book( "Node JS","Server side","The modern web application has really come a long way over the years with the introduction of many popular frameworks such as bootstrap, Angular JS, etc. All of these frameworks are based on the popular JavaScript framework.\n" +
                "\n",R.mipmap.wildone));
        listBook.add(new Book( "Python","Server side","Python is a general-purpose, versatile and popular programming language. It’s great as a first language because it is concise and easy to read, and it is also a good language to have in any programmer’s stack as it can be used for everything from web development to software development and scientific applications.",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));
        listBook.add(new Book( "Javascript","Web Development","Javascript for dynamic web content",R.mipmap.wildone));


        RecyclerView myrv = findViewById(R.id.recycler_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, listBook);

        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
