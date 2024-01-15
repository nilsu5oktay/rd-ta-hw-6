package org.example;

import java.util.*;

public class FindRepeatedLetters {

    private Boolean stringContainsRepeatedChars(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    private ArrayList<String> createStringListContainsRepeatedChars(ArrayList<String> stringList){

        ArrayList<String> listOfStringsWithRepeatedChars = new ArrayList<>();

        for(int i=0; i<stringList.size(); i++){
            String toBeCheckedString = stringList.get(i);
            if(stringContainsRepeatedChars(toBeCheckedString)){
                listOfStringsWithRepeatedChars.add(toBeCheckedString);
            }
        }
        return listOfStringsWithRepeatedChars;
    }

    public String createSingleString (ArrayList<String> stringList){
        ArrayList<String> result = createStringListContainsRepeatedChars(stringList);
        String s="";
        for(int i=0; i<result.size(); i++){
            s += result.get(i) + " ";
        }
        return s;
    }

}

