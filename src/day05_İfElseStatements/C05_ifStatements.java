package day05_İfElseStatements;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {
        /* kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın üçgen eşkenar ise
        "Eskenar üçgen" yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını girin");


        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double  kenar3 = scanner.nextDouble();


        if (kenar1==kenar2 && kenar2 == kenar3 && kenar1>0 ) {

            System.out.println("Girilen degerler Eşkenar üçgen olusturur");
        }
    }
}

