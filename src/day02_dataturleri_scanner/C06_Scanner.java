package day02_dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*soru 2 kullanıcıdan bir double birde int sayı alıp bunların toplamını ve çarpımını
        yazdırın
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double ondalıklıSayi=scan.nextDouble();

        System.out.println("Lütfen bir tamsayı giriniz");
        int tamsayi =scan.nextInt();

        System.out.println("Girilen sayıların toplamı:"+(ondalıklıSayi+tamsayi));

        System.out.println("Girilen sayıların çarpımı:"+(ondalıklıSayi*tamsayi));

    }
}
