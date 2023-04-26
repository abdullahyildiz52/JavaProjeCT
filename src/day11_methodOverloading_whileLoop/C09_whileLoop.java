package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C09_whileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan poozitif tamsay iisteyin
        kullanic 0 abasanakadar isleme devam edin
        kullanici 0 bastiginda tamsayiadedini ve toplamini yazdirin
        kullanic negatif sayi gitrerse uyari verin ve o sayisyi adede eklemeyin
         */
        Scanner scanner= new Scanner(System.in);
        int sayi=1;// 0 a basildiginda islem biteceginde n dolayi 0 dan arkli ssyi girmek gerekiyor
        int sayac=0;
        int toplam=0;

        while (sayi!=0){
            System.out.println("toplanmak uzere pozitif bir tamsayi girin\nbitirmek icin 0 a basin");
            sayi= scanner.nextInt();

            if (sayi>0) {
                sayac++;
                toplam += sayi;
            } else if (sayi<0) {
                System.out.println("pozitif tamsayi girmeelsiniz");

            }

        }
        System.out.println("girdiginiz "+sayac+" adet sayinin toplami;"+toplam);

    }
}
