package com.company;

public class PoemTester {
    public static void main(String[] args) {
        System.out.println("Poem:");
        Poem p1 = new Poem(12);
        System.out.println(p1.getNumLines());
        p1.printRhythm();
        System.out.println();

        System.out.println("Haiku:");
        Haiku h1 = new Haiku();
        System.out.println(h1.getNumLines());
        System.out.println(h1.getSyllables(2));
        h1.printRhythm();
        System.out.println();

        System.out.println("Limerick:");
        Limerick lim1 = new Limerick();
        System.out.println(lim1.getNumLines());
        System.out.println(lim1.getSyllables(2));
        System.out.println(lim1.getSyllables(4));
        lim1.printRhythm();

    }
}