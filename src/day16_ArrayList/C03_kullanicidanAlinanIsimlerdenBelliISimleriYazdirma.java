package day16_ArrayList;

import java.util.List;

public class C03_kullanicidanAlinanIsimlerdenBelliISimleriYazdirma {
    public static void main(String[] args) {

        // kullanicidan alinan isimlerden olusan listede 3 harften fazla olaan isimleri yazdirin
        List<String> yeniIsimler=C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        // listenin elemanlarina ulasmak icin bir loop
        // listenin elemanlari 3 harfli veya fazlays a yazdiran program

        for (int i = 0; i <yeniIsimler.size(); i++) {

            if (yeniIsimler.get(i).length()>=3){
                System.out.println(yeniIsimler.get(i));
            }


        }

    }




}
