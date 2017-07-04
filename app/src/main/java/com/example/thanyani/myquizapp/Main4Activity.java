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

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

            Button back, results, next;
            ImageView image1, image2;

            private EditText name;

            int score=0;
            int score1=0;
            int score2=0;
            int score3=0;
            int score4=0;

            private RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5;


            Questions questions=new Questions();


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main4);

                radioGroup1 = (RadioGroup) findViewById(R.id.grp);
                radioGroup2 = (RadioGroup) findViewById(R.id.grp1);
                radioGroup3 = (RadioGroup) findViewById(R.id.grp2);
                radioGroup4 = (RadioGroup) findViewById(R.id.grp3);
                radioGroup5 = (RadioGroup) findViewById(R.id.grp4);
                name= (EditText) findViewById(R.id.name_editText);
                image1= (ImageView) findViewById(R.id.back);
                results= (Button) findViewById(R.id.button7);
                image2= (ImageView) findViewById(R.id.next);


                image1.setOnClickListener(this);
                results.setOnClickListener(this);
                image2.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.back){
                    Intent intent= new Intent(Main4Activity.this, Main2Activity.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.next){
            Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.button7){


            questions.setOption1(1);
            questions.setOption2(0);
            questions.setOption3(0);
            questions.setOption4(0);


            if (radioGroup1.getCheckedRadioButtonId()==R.id.radYouth2) {
                score = questions.getOption1();
            }
            else if (radioGroup1.getCheckedRadioButtonId()==R.id .radYouth){
                score=questions.getOption2();
            }
            else if (radioGroup1.getCheckedRadioButtonId()==R.id .radYouth1){
                score=questions.getOption3();
            }
            else if (radioGroup1.getCheckedRadioButtonId()==R.id.radYouth3) {
                score = questions.getOption4();

            }
            if (radioGroup2.getCheckedRadioButtonId()==R.id.radNew2){
                score1=questions.getOption1();
            }
            else if (radioGroup2.getCheckedRadioButtonId()==R.id.radNew){
                score1=questions.getOption2();
            }
            else if (radioGroup2.getCheckedRadioButtonId()==R.id.radNew1){
                score1=questions.getOption3();
            }
            else if (radioGroup2.getCheckedRadioButtonId()==R.id.radNew3){
                score1=questions.getOption4();
            }


            if (radioGroup3.getCheckedRadioButtonId()==R.id.radRel2){
                score2=questions.getOption1();
            }
            else if (radioGroup3.getCheckedRadioButtonId()==R.id.radRel){
                score2=questions.getOption2();
            }
            else if (radioGroup3.getCheckedRadioButtonId()==R.id.radRel1){
                score2=questions.getOption3();
            }
            else if (radioGroup3.getCheckedRadioButtonId()==R.id.radRel3){
                score2=questions.getOption4();
            }


            if (radioGroup4.getCheckedRadioButtonId()==R.id.radWill2){
                score3=questions.getOption1();
            }
            else if (radioGroup4.getCheckedRadioButtonId()==R.id.radWill){
                score3=questions.getOption2();
            }
            else if (radioGroup4.getCheckedRadioButtonId()==R.id.radWill1){
                score3=questions.getOption3();
            }
            else if (radioGroup4.getCheckedRadioButtonId()==R.id.radWill3){
                score3=questions.getOption4();
            }


            if (radioGroup5.getCheckedRadioButtonId()==R.id.radHol2){
                score4=questions.getOption1();
            }
            else if (radioGroup5.getCheckedRadioButtonId()==R.id.radHol){
                score4=questions.getOption2();
            }
            else if (radioGroup5.getCheckedRadioButtonId()==R.id.radHol1){
                score4=questions.getOption3();
            }
            else if (radioGroup5.getCheckedRadioButtonId()==R.id.radHol3){
                score4=questions.getOption4();
            }

            int total=score+score1+score2+score3+score4;
            String names=name.getText() .toString();

            AlertDialog.Builder dialog = new AlertDialog.Builder(Main4Activity.this);
            dialog.setTitle("Score Results");
            dialog.setMessage( names +" \n you have scored: " + total + " Points");


            dialog.setPositiveButton("Next questions", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
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
