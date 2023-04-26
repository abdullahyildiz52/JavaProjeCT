package day05_İfElseStatements;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan notunu alın 50 veya daha büyükse "sınfı geçti" yazın
        50 den küçükse "maalesef kaldın" yazdırın
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen notunu gir");

        double not=scanner.nextDouble();

        if (not>=50) System.out.println("Sınıfı geçtiniz");
        if (not<50) System.out.println("maalesef kaldınız");

        /*
        aynı durum aşağıdaki gibi yapılabilir
         */
        if (not>=50) {
            System.out.println("Sınıfı geçtiniz");
        }
        else {
            System.out.println("maalesef kaldınız");
        }

        /*
        if ve else aynı şarta bağlıdır sadece biri çalışır
         */




    }
}
