package org.example;

public class GezegenTest {
    public static void main(String[] args) {
            for (Gezegenler.Gezegen g : Gezegenler.Gezegen.values()) {
                System.out.println("Gezegenin adı: " + g + " Güneşe uzaklık sıralaması: " + g.getUzaklikNo() + " Güneşe uzaklığı: " + g.getUzaklik() + " Yarıçapı: " + g.getYaricapi() + " Donme süresi: " + g.getDonmeSuresi());

            }
        }
    }

