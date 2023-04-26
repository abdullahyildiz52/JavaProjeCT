package day02_dataturleri_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /*
        soru 7(interviev) kullanıcıdan 2 sayı alın
        ikisinin değerlerini değiştirin(swap)
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sırasıyla ilk sayıyı girin");
        double sayi1 = scan.nextDouble();

        System.out.println("Lütfen sırasıyla ikinci sayıyı girin");
        double sayi2= scan.nextDouble();

        double temp= 0;
        //
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("Sayıların yelrini değiştirdim"+"\nArtık Birinci sayı "+sayi1+" ikinci sayı: "+sayi2);

    }
}
