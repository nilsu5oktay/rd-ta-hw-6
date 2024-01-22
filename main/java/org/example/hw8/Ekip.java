package org.example.hw8;

import java.util.ArrayList;
import java.util.List;

public interface Ekip  {
    String lead = null;
    List personelList = null;
    ArrayList taskList = null;


    void leadDegistirme();

    void personelEkle();

    void personelCikar();

    void personelGuncelle();

    void taskEkle();

    void taskGuncelle();
}
