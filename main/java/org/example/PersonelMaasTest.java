package org.example;

public class PersonelMaasTest {
    public static void main(String[] args) {
       MaasHesaplama personel1 = new MaasHesaplama();
       MaasHesaplama personel2 = new MaasHesaplama();

       personel1.isim = "Nilsu";
       personel1.soyisim = "Oktay";
       personel1.gunlukMaas = 100;
       personel1.calistigiGunSayisi = 30;


        personel2.isim = "Gizem";
        personel2.soyisim = "Tural";
        personel2.gunlukMaas = 200;
        personel2.calistigiGunSayisi = 20;


        personel1.personelMaasHesaplama();
        personel2.personelMaasHesaplama();

        personel1.personelMaasBilgileriniGetir();
        personel2.personelMaasBilgileriniGetir();

    }
}
