package org.example;

import java.util.ArrayList;

public class FindRepeatedLettersRun {

    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<>();
        testList.add("bana");
        testList.add("geldi");
        testList.add("cicekler");

        FindRepeatedLetters f = new FindRepeatedLetters();
        System.out.println(f.createSingleString(testList));


    }
}
