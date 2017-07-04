package com.example.thanyani.myquizapp;

/**
 * Created by THANYANI on 2017/06/26.
 */

public class Question {

    private int optionA;
    private int optionB;
    private int optionC;
    private int optionD;


    public Question() {
    }

    public Question(int optionA, int optionB, int optionC, int optionD) {
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }

    public int getOptionA() {
        return optionA;
    }

    public void setOptionA(int optionA) {
        this.optionA = optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public void setOptionB(int optionB) {
        this.optionB = optionB;
    }

    public int getOptionC() {
        return optionC;
    }

    public void setOptionC(int optionC) {
        this.optionC = optionC;
    }

    public int getOptionD() {
        return optionD;
    }

    public void setOptionD(int optionD) {
        this.optionD = optionD;
    }
}
