package day09_StringManuplation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        /*
        kullanicidan 2 sayi aliniz ve bu sayilar dahil olmak uzere aralarindaki
        3 ile bolnebilen sayalri yazdirin
        ilk girlen sayi 2 .sayidan buyuk se hata medaji yazdirin
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir sayi tamsayi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("lutfen ikinci sayiyi girin");
        int sayi2 = scanner.nextInt();

        if (sayi1 < sayi2) {
            for (int i = sayi1; i < sayi2; i++) {

                if (sayi1%3==0){

                    System.out.println(i+" ");}

            }
        }
        else {
            System.out.println("birinci sayi kucuk olmali");

        }
    }
}
