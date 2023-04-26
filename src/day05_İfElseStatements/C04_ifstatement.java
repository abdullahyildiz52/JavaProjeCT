package day05_İfElseStatements;

import java.util.Scanner;

public class C04_ifstatement {
    public static void main(String[] args) {
        /*
        verilen bir sayının 2,3,5,7,11 ve 23 sayılarından kaç tanesine kalansız bölünebilir
        örneğin 30 dediğinde output :3
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilensayi=scanner.nextInt();
        int sayac=0;

        if (girilensayi%2==0 ) sayac++;
        if (girilensayi%3==0 ) sayac++;
        if (girilensayi%5==0 ) sayac++;
        if (girilensayi%7==0 ) sayac++;
        if (girilensayi%11==0 ) sayac++;
        if (girilensayi%23==0 ) sayac++;

        System.out.println("Girilen sayı,istenen sayılardan" +" "+ sayac +" " + "tanesine tam bölünür");


    }
}
