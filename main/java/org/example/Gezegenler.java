package org.example;
class Gezegenler {

    public enum Gezegen {
        MERKUR(1, 57, 2.4, 87),
        VENUS(2, 110, 6.0, 224),
        DUNYA(3, 148, 6.3, 365),
        MARS(4, 230, 3.3, 687),
        JUPITER(5, 780, 69.9, 11868),
        SATURN(6, 1438, 58.2, 29400),
        URANUS(7, 2970, 25.3, 84),
        NEPTUN(8, 4495, 24.6, 164);


        private int uzaklikNo;
        private int uzaklik;
        private double yaricapi;
        private int donmeSuresi;

        Gezegen(int uzaklikNo, int uzaklik, double yaricapi, int donmeSuresi) {
            this.uzaklikNo = uzaklikNo;
            this.uzaklik = uzaklik;
            this.yaricapi = yaricapi;
            this.donmeSuresi = donmeSuresi;

        }

        public int getUzaklikNo() {
            return uzaklikNo;
        }

        public int getUzaklik() {
            return uzaklik;
        }

        public double getYaricapi() {
            return yaricapi;
        }

        public int getDonmeSuresi() {
            return donmeSuresi;
        }

    }
    }



