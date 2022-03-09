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
        String ta = "";
        for (int i = 1; i <= getNumLines(); i++) {
            for (int j = 0; j < getSyllables(i); j++) {
                ta += "ta-";
            }
            ta = ta.substring(0,ta.length()-1);
            ta += "\n";
        }
        System.out.println(ta);
    }
}
