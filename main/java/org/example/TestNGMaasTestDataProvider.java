package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGMaasTestDataProvider {
    MaasHesaplama maashesapla = new MaasHesaplama();

    @Test(groups = "PassTests", dataProvider = "maasdata")
    public void maasHesaplaTest(int a, int b){
        assertEquals(maashesapla.maasHesapla(a), b);
    }

    @DataProvider(name = "maasdata")
    public Object[][] maasdata(){
        return new Object[][]{{10,100000},{20,200000}};

    }
}
