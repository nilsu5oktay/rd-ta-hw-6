package org.example.hw8;

public class Erkek extends Personel{

    @Override
    void emeklilikHesapla() {
        int beklenecekYil = 65 - yas;
        if (yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println(beklenecekYil + " yıl daha beklemelisiniz.");
        }


    }

    }

