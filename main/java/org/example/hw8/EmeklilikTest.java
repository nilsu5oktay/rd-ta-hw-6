package org.example.hw8;

public class EmeklilikTest {
    public static void main(String[] args) {
        Erkek personel1 = new Erkek();
        Kadın personel2 = new Kadın();

        personel1.yas=59;
        personel2.yas=63;

        personel1.emeklilikHesapla();
        personel2.emeklilikHesapla();
    }
}
