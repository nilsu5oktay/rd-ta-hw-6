package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGMaasTest {
    MaasHesaplama maashesapla = new MaasHesaplama();

    @Test(groups = "PassTests")
    public void maasHesaplaTest() {
        assertEquals(maashesapla.maasHesapla(10), 100000);
    }

    @Test(groups = "FailTests")
    public void maasHesaplaTestHata() {
        assertEquals(maashesapla.maasHesapla(10), 100001);

    }
    @Test(groups = "PassTests")
    public void primHesaplaTest() {
        assertEquals(maashesapla.primHesapla(50), 25000);
    }

    @Test(groups = "FailTests")
    public void primHesaplaTestHata() {
        assertEquals(maashesapla.primHesapla(50), 25001);
    }
}
