package org.example;
class EnumOrnek {

    public enum Gezegenler {
        MERKUR(1, 57, 2.4, 87),
        VENUS(2, 110, 6.0, 224),
        DUNYA(3, 148, 6.3, 365),
        MARS(4, 230, 3.3, 687),
        JUPITER(5, 780, 69.9, 11868),
        SATURN(6, 1438, 58.2, 29400),
        URANUS(7, 2970, 25.3, 84),
        NEPTUN(8, 4495, 24.6, 164);


        private int guneseUzaklikNo;
        private int guneseUzaklik;
        private double yaricapi;
        private int donmeSuresi;

        Gezegenler(int guneseUzaklikNo, int guneseUzaklik, double yaricapi, int donmeSuresi) {
            this.guneseUzaklikNo = guneseUzaklikNo;
            this.guneseUzaklik = guneseUzaklik;
            this.yaricapi = yaricapi;
            this.donmeSuresi = donmeSuresi;

        }

        public int getGuneseUzaklikNo() {
            return guneseUzaklikNo;
        }

        public int getGuneseUzaklik() {
            return guneseUzaklik;
        }

        public double getYaricapi() {
            return yaricapi;
        }

        public int getDonmeSuresi() {
            return donmeSuresi;
        }

        public static void main(String[] args) {
            for (Gezegenler gezegen : Gezegenler.values()) {
                System.out.println("Gezegenin adı: " + gezegen + " Güneşe uzaklık sıralaması: " + gezegen.guneseUzaklikNo + " Güneşe uzaklığı: " + gezegen.guneseUzaklik);

            }
        }
    }
    }



