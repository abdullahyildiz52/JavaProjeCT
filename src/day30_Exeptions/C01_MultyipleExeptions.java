package day30_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultyipleExeptions {
    public static void main(String[] args) {
        try {
            // erisim
            FileInputStream fis = new FileInputStream("src/day29_exeptions/deneme.txt");
            //okuma
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) { // erisim
            System.out.println("Dosya yolu hatali, dosyaya erisilemedi");
        } catch (IOException e) { // erisim ve okuma
            System.out.println("Dosyaya erisim ve okuma ile ilgili bir hata var");
        }
        /*
        eğer parent-child ilişkisi olan  birden fazla exeptions türünü try-catch ile
        handle etmek istersek
        1) iç içe iki try-catch bloğu oluşturabiliriz
        2) eğer bir try birden fazla catch blogu olusturacaksak
        once chıld exeptıons ıcın catch blogu yazılmalıdır
        sonra parent exejptıons ıcın.
        cunku parentten sonra chıld yazarsak parentın yakalamayıp chıld ın yakalayacagı
        exeptıons olmayacagından java o chıld exep. sılmemızı ıster
        3) child exception icin catch yazmadan
       sadece parent icin 1 tane catch blogu yazmak da yeterli olur
         */
    }
}
