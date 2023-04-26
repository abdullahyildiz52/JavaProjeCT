package day06_nestedifElseStatement_ternaryOperator;

import java.util.Scanner;

public class C01_benim_test {
    public static void main(String[] args) {

        /* kullanıcıdan bir sayı girmesini isteyin
        sayı asagıdaki sARTları saglıyorsa "Mukemmel sayi"
        saglamayan sartların tamamını kullanıcıya soyleyın

        1- sayı 4 basamaklı olmalıdır
        2-sayı 3 e bolunebilmeli
        3-sayı 5 ile bolumemeli
        4-sayının birler basamagı tek sayı olmalıdır

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi =scanner.nextInt();

        boolean sayiMukemmelMi=true;

        // sarı 4 basamaklı
        if (sayi<1000|| sayi>9999) {
            System.out.println("sayı 4 basamaklı olmalıdır");
            sayiMukemmelMi = false;
        }
        // 2- sayı 3 ile bolunebilmeli
            if (sayi%3 !=0) {
                System.out.println("sayı 3 ile bölünebilmeli");
                sayiMukemmelMi = false;
            }
        // 3-sayı 5 ile beölunememelidir
        if (sayi%5==0) {
            System.out.println("sayı 5 ile bölunememelidir");
            sayiMukemmelMi = false;
        }
        //4-sayı nın birler basamağı tek olmalı
        if ((sayi%10)%2==0) {
            System.out.println("sayını birler basamağı tek olmalıdır");
            sayiMukemmelMi = false;
        }
        if (sayiMukemmelMi){
            System.out.println("Sayı Mükemmel sayı");
        }

        }
}

