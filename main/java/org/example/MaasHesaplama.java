package org.example;

public class MaasHesaplama {
    String isim;
    String soyisim;
    int maas;
    int gunlukMaas;
    int calistigiGunSayisi;


    public void personelMaasHesaplama() {
        if (calistigiGunSayisi > 25) {
            maas = ((calistigiGunSayisi * gunlukMaas) + (calistigiGunSayisi - 25) * 1000);
        }
        else {
            maas = calistigiGunSayisi * gunlukMaas;
        }
    }

    public void personelMaasBilgileriniGetir() {
        System.out.println("Personelin adı: " + isim + " " + "Personelin soyadı: " + soyisim + " " + "Personelin maaşı: " + maas);
    }
}
