package com.company;

public class Haiku extends Poem{


    public Haiku(){
        super(3);
    }
    public int getSyllables(int k){
        if(k == 1 || k == 3) {
            return 5;
        }
        else {
            return 7;
        }
    }

    public void printRhythm(){
        for (int i = 1; i <= getNumLines(); i++) {
            printTa(getSyllables(i));
        }
    }
}
