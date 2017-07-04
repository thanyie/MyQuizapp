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

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    private EditText name;
    Button btnResults, btnBack, btnNext;
    ImageView image1, image2;

    int score = 0;
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;

    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;


    Question question = new Question();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioGroup1 = (RadioGroup) findViewById(R.id.group);
        radioGroup2 = (RadioGroup) findViewById(R.id.group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.group4);
        radioGroup5 = (RadioGroup) findViewById(R.id.group5);
        name= (EditText) findViewById(R.id.editText2);
        image1=(ImageView) findViewById(R.id.back);
        image2=(ImageView)findViewById(R.id.next);
        btnResults=(Button) findViewById(R.id.results);

        image2.setOnClickListener(this);
        btnResults.setOnClickListener(this);
        image1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.next) {
            Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.back) {
            Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.results) {


            question.setOptionA(1);
            question.setOptionB(0);
            question.setOptionC(0);
            question.setOptionD(0);

            if (radioGroup1.getCheckedRadioButtonId() == R.id.ans1) {
                score = question.getOptionA();
            } else if (radioGroup1.getCheckedRadioButtonId() == R.id.ans1a) {
                score = question.getOptionB();
            } else if (radioGroup1.getCheckedRadioButtonId() == R.id.ans1b) {
                score = question.getOptionC();
            } else if (radioGroup1.getCheckedRadioButtonId() == R.id.ans1c) {
                score = question.getOptionD();
            }


            if (radioGroup2.getCheckedRadioButtonId() == R.id.ans2) {
                score1 = question.getOptionA();
            } else if (radioGroup2.getCheckedRadioButtonId() == R.id.ans2a) {
                score1 = question.getOptionB();
            } else if (radioGroup2.getCheckedRadioButtonId() == R.id.ans2b) {
                score1 = question.getOptionC();
            } else if (radioGroup2.getCheckedRadioButtonId() == R.id.ans2c) {
                score1 = question.getOptionD();
            }


            if (radioGroup3.getCheckedRadioButtonId() == R.id.ans3) {
                score2 = question.getOptionA();
            } else if (radioGroup3.getCheckedRadioButtonId() == R.id.ans3a) {
                score2 = question.getOptionB();
            } else if (radioGroup3.getCheckedRadioButtonId() == R.id.ans3b) {
                score2 = question.getOptionC();
            } else if (radioGroup3.getCheckedRadioButtonId() == R.id.ans3c) {
                score2 = question.getOptionD();

            }


            if (radioGroup4.getCheckedRadioButtonId() == R.id.ans4) {
                score3 = question.getOptionA();
            } else if (radioGroup4.getCheckedRadioButtonId() == R.id.ans4a) {
                score3 = question.getOptionB();
            } else if (radioGroup3.getCheckedRadioButtonId() == R.id.ans4b) {
                score3 = question.getOptionC();
            } else if (radioGroup3.getCheckedRadioButtonId() == R.id.ans4c) {
                score3 = question.getOptionD();

            }


            if (radioGroup5.getCheckedRadioButtonId() == R.id.ans5) {
                score4 = question.getOptionA();
            } else if (radioGroup5.getCheckedRadioButtonId() == R.id.ans5a) {
                score4 = question.getOptionB();
            } else if (radioGroup5.getCheckedRadioButtonId() == R.id.ans5b) {
                score4 = question.getOptionC();
            } else if (radioGroup5.getCheckedRadioButtonId() == R.id.ans5c) {
                score4 = question.getOptionD();


            }
            int total = score + score1 + score2 + score3 + score4;
            String names = name.getText().toString();

            AlertDialog.Builder dialog = new AlertDialog.Builder(Main3Activity.this);
            dialog.setTitle("Score Results");
            dialog.setMessage(names + " \n you have scored: " + total + " Points");


            dialog.setPositiveButton("Next Questions", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
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
    }}



