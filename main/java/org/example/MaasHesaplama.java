package org.example;

public class MaasHesaplama {
//    String isim;
//    String soyisim;
//    int maas;
//    int gunlukMaas;
//    int calistigiGunSayisi;
//
//    public void personelMaasHesaplama() {
//        if (calistigiGunSayisi > 25) {
//            maas = ((calistigiGunSayisi * gunlukMaas) + (calistigiGunSayisi - 25) * 1000);
//        }
//        else {
//            maas = calistigiGunSayisi * gunlukMaas;
//        }
//    }
//
//    public void personelMaasBilgileriniGetir() {
//        System.out.println("Personelin adı: " + isim + " " + "Personelin soyadı: " + soyisim + " " + "Personelin maaşı: " + maas);
//    }
//}



    int yevmiye = 10000;
    int prim = 1000;
    int maas = 0;
    int bonus = 0;

    public int maasHesapla(int calisilangun) {
        maas = (calisilangun * yevmiye);
        return maas;
    }

    public int primHesapla(int calisilangun) {
        bonus = ((calisilangun - 25) * prim);
        return bonus;
    }

    public void kazanilanMaas(int calisilangun) {

        if (calisilangun > 0 && calisilangun <= 25) {
            System.out.println(calisilangun + " gün çalışıldıktan sonra hakedilen maas " + maasHesapla(calisilangun));
        } else if (calisilangun > 25) {
            System.out.println(calisilangun + " gün çalışıldıktan sonra hakedilen maas " + primHesapla(calisilangun) + "TL primle beraber toplam " + (maasHesapla(calisilangun) + primHesapla(calisilangun)));
        } else if (calisilangun < 0) {
            System.out.println("Çalışılan gün sayısı negatif girilemez...");
        } else
            System.out.println("Çalışılan gün 0 olduğu için maaş hakkı kazanılmadı...");
    }

}