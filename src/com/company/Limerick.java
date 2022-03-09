package com.company;

public class Limerick extends Poem {

    public Limerick() {
        super(5);
    }

    public int getSyllables(int k) {
        if (k == 1 || k == 2 || k == 5) {
            return 9;
        }
        else return 6;
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
