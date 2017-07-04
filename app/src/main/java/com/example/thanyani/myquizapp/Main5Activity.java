package com.example.thanyani.myquizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener{

    Button points;
    ImageView image, image1;

    private EditText name;

    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    int score = 0;
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;

    Question question = new Question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        radioGroup1 = (RadioGroup) findViewById(R.id.gp1);
        radioGroup2 = (RadioGroup) findViewById(R.id.gp2);
        radioGroup3 = (RadioGroup) findViewById(R.id.gp3);
        radioGroup4 = (RadioGroup) findViewById(R.id.gp4);
        radioGroup5 = (RadioGroup) findViewById(R.id.gp5);
        name = (EditText) findViewById(R.id.edit_Text);
        image= (ImageView) findViewById(R.id.imageView3);
        points = (Button) findViewById(R.id.point);
        image1=(ImageView) findViewById(R.id.next) ;


        image.setOnClickListener(this);
        image1.setOnClickListener(this);
        points.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.imageView3){
            Intent intent = new Intent(Main5Activity.this, Main2Activity.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.next){
            Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.point){
            question.setOptionA(1);
            question.setOptionB(0);
            question.setOptionC(0);
            question.setOptionD(0);

            if (radioGroup1.getCheckedRadioButtonId() == R.id.a1) {
                score = question.getOptionA();


            }
            else if (radioGroup1.getCheckedRadioButtonId() == R.id.a2) {
                score = question.getOptionB();
            }
            else if (radioGroup1.getCheckedRadioButtonId() == R.id.a3) {
                score = question.getOptionC();
            }
            else if (radioGroup1.getCheckedRadioButtonId()==R.id.a4){
                score=question.getOptionD();
            }


            if (radioGroup2.getCheckedRadioButtonId()==R.id.b1){
                score1=question.getOptionD();
            }
            else if (radioGroup2.getCheckedRadioButtonId()==R.id.b2){
                score1=question.getOptionC();
            }
            else if (radioGroup2.getCheckedRadioButtonId()==R.id.b3){
                score1=question.getOptionA();
            }
            else if (radioGroup2.getCheckedRadioButtonId()==R.id.b4){
                score1=question.getOptionB();
            }


            if (radioGroup3.getCheckedRadioButtonId()==R.id.c1){
                score2=question.getOptionB();
            }
            else if (radioGroup3.getCheckedRadioButtonId()==R.id.c2){
                score2=question.getOptionA();
            }
            else if (radioGroup3.getCheckedRadioButtonId()==R.id.c3){
                score2=question.getOptionC();
            }
            else if (radioGroup3.getCheckedRadioButtonId()==R.id.c4){
                score2=question.getOptionD();
            }


            if (radioGroup4.getCheckedRadioButtonId()==R.id.d1){
                score3=question.getOptionD();
            }
            else if (radioGroup4.getCheckedRadioButtonId()==R.id.d2){
                score3=question.getOptionC();
            }
            else if (radioGroup4.getCheckedRadioButtonId()==R.id.d3){
                score3=question.getOptionB();
            }
            else if (radioGroup4.getCheckedRadioButtonId()==R.id.d4){
                score3=question.getOptionA();
            }


            if (radioGroup5.getCheckedRadioButtonId()==R.id.e1){
                score4=question.getOptionA();
            }
            else if (radioGroup5.getCheckedRadioButtonId()==R.id.e2) {
                score4 = question.getOptionD();
            }
            else if (radioGroup5.getCheckedRadioButtonId()==R.id.e3){
                score4=question.getOptionC();
            }
            else if (radioGroup5.getCheckedRadioButtonId()==R.id.e4){
                score4=question.getOptionB();
            }

            int total=score+score1+score2+score3+score4;
            String names=name.getText() .toString();

            AlertDialog.Builder dialog = new AlertDialog.Builder(Main5Activity.this);
            dialog.setTitle("Score Results");
            dialog.setMessage( names +" \n you have scored: " + total + " Points" );


            dialog.setPositiveButton("Next Questions", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent= new Intent(Main5Activity.this, Main6Activity.class);
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

    }
}
