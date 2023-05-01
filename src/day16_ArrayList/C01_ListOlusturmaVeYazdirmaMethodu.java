package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaVeYazdirmaMethodu {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");

        // method call
        listeYazdirma(isimler);

    }
    public static void listeYazdirma( List<String> isimler){
      // sadece yazdirma kullnalilicaksa return type void girilir

        System.out.println(isimler);
    }
}
