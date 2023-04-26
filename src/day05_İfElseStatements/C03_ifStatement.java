package day05_İfElseStatements;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {
        /* kullanıcıdan bir sayı alın sayı 3 ile bolunuyorsa "üç ile bölünebilen sayı"
        5 ile bölünüyorsa "5 ile bölünen sayı" yazdırın
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int girilensayi=scanner.nextInt();
        if (girilensayi%3==0) System.out.println("3 ile bölünebilen sayı");
        if (girilensayi%5==0) System.out.println("5 ile bölünebilen sayı");

    }
}
