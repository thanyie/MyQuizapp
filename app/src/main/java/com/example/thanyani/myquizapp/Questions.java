package com.example.thanyani.myquizapp;

/**
 * Created by THANYANI on 2017/06/26.
 */

public class Questions {

    private int option1;
    private int option2;
    private int option3;
    private int option4;

    public Questions() {
    }

    public Questions(int option1, int option2, int option3, int option4) {
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public int getOption3() {
        return option3;
    }

    public void setOption3(int option3) {
        this.option3 = option3;
    }

    public int getOption4() {
        return option4;
    }

    public void setOption4(int option4) {
        this.option4 = option4;
    }
}
