package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ogrenciNotlari {
    public static void main(String[] args) {


        //ogretmenden alinan ogrenci notlarinin ortalamasini v kac ogrencinin ortalamanin
        // ustunde not aldigini bize donduren bir method yazdirin
    /*
    1 notlar alincak
     */
        List<Integer> notlarListesi = C04_KullanicidanIntListOlusturma.kullanicidanSayiAlarakListeOlusturanMethod();

     notOrtVeUstOgrenciSayisi(notlarListesi);

    }
    public static void notOrtVeUstOgrenciSayisi( List<Integer> notlarListesi){
        int toplamNot = 0;
        int ortalamaNot = 0;
        int sayac=0;
        for (int i = 0; i <notlarListesi.size() ; i++) {
            toplamNot=toplamNot+notlarListesi.get(i);

        }
        ortalamaNot=toplamNot/notlarListesi.size(); // int oldupgu icin kusurat yazmayacak

         // not ortalaması üzerindeki ogrenci sayısı
        for (int i = 0; i <notlarListesi.size() ; i++) {
            if (notlarListesi.get(i)>ortalamaNot){
                sayac++;
            }
        }
        System.out.println("siniftaki ogrenci sayisi : " +notlarListesi.size());
        System.out.println("sinifin ortalama notu : " + ortalamaNot);
        System.out.println("sinifta ortalama not ustu ogrenci sayisi : " + sayac);

    }
}
