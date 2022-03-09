package com.company;

public class Poem {

    private int lines;

    public Poem(int n){
        lines = n;
    }


    public int getNumLines(){
        return lines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");
    }
}


