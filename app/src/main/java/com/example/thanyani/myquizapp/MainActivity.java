package com.example.thanyani.myquizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView image;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image= (ImageView) findViewById(R.id.play);


        image.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
     if(v.getId()==R.id.play){
         AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
         dialog.setTitle("HOW TO PLAY");
         dialog.setMessage("This is my quiz app, you have to select one of the categories that \nyou want to start with and write your name on top of each and every category, \nafter you will have to answer the questions based on each category and press the \npoints/results button to see your score");


         dialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 startActivity(intent);
                 //intent
                 dialog.dismiss();
             }
         });

         dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 //closing finish
                 dialog.dismiss();
             }
         });

         dialog.show();
     }
//
//         Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//         startActivity(intent);
     }
    }
