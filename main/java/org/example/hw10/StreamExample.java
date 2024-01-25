package org.example.hw10;


import java.util.List;
import java.util.Optional;

public class StreamExample {

    public static <T> T searchElement(List <T> list, T targetElement) {
        return list.stream()
                .filter(element -> element.equals(targetElement))
                .findFirst()
                .orElse((T)"-1");

    }


    public static void main(String[] args) {
        List<String> stringList = List.of("Nilsu", "Oktay", "Ece", "Gizem");

        String result1 = searchElement(stringList, "Nilsu");
        System.out.println("Result 1: " + result1);

        String result2 = searchElement(stringList, "Tural");
        System.out.println("Result 2: " + result2);
    }
}
