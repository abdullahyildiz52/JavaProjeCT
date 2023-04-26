package day02_dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*kullanıcıdan ismini isteyin
        ismi büyük harfe çevirin
        sonra kuollanıcıya yeni halini yazdırın
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");

        String girilenIsim = scan.nextLine();

        girilenIsim = girilenIsim.toUpperCase();

        System.out.println("Girilen isimin düzenlenmiş hali:"+girilenIsim);



    }
}
