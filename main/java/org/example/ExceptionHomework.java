package org.example;

public class ExceptionHomework
{
    public static void main(String[ ] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Yanlış çıktı yazdırılmak isteniyor.");
        } finally {
            System.out.println("Yazdırma işlemi bitti.");
        }
        }
    }

