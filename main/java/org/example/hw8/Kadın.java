package org.example.hw8;


public class Kadın extends Personel{

    @Override
    void emeklilikHesapla() {
        int beklenecekYil = 60 - yas;
        if (yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println(beklenecekYil + " yıl daha beklemelisiniz.");
        }



    }
}
