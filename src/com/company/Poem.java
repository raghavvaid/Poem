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

    public void printTa(int k){
        for (int i = 0; i < k-1; i++){
            System.out.print("ta-");
        }
        System.out.println("ta");
    }
}


