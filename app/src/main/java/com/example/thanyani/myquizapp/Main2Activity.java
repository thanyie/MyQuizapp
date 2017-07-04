package com.example.thanyani.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView image1,image2,image3, image4, image5;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);






            image1 = (ImageView) findViewById(R.id.imageView5);
            image2 = (ImageView) findViewById(R.id.imageView4);
            image3 = (ImageView) findViewById(R.id.imageView6);
            image4= (ImageView) findViewById(R.id.previous);
            image5= (ImageView) findViewById(R.id.imageView7);

            image1.setOnClickListener(this);
            image2.setOnClickListener(this);
            image3.setOnClickListener(this);
            image4.setOnClickListener(this);
            image5.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {

            if (v.getId()==R.id.imageView4){
                Intent myForm = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(myForm);
            }
            else if (v.getId()==R.id.imageView5){
                Intent myForm = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(myForm);
            }
            else if (v.getId()==R.id.imageView6){
                Intent myForm = new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(myForm);
            }
            else if (v.getId()==R.id.previous){
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            } else if (v.getId() == R.id.imageView7) {

                Intent intent = new Intent(Main2Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        }
    }



