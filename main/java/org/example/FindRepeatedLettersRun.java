package org.example;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindRepeatedLettersRun {

    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<>();
        testList.add("bana");
        testList.add("geldi");
        testList.add("cicekler");

        FindRepeatedLetters f = new FindRepeatedLetters();
        String x = f.createSingleString(testList);
        System.out.println(x);

        List<String> characters = Arrays.asList(x.split(""));
        Collections.shuffle(characters);
        String afterShuffle = "";
        for (String character : characters)
        {
            afterShuffle += character;
        }
        System.out.println(afterShuffle);
    }

    }








