package com.iinncerredible.jjookker.irepc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private Group group;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),IJ.class));
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        group = findViewById(R.id.view1);

        Click click = new Click(imageView,textView,group,this);
        click.click();

    }
}