package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C10_whileLoopUsHessaplama {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi ve hesaplamak icin us isteyin
        while loop kullanrak sayinin ussunu alan bir method olusturun
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scanner.nextDouble();
        System.out.println("lutfen pozitif bir tamsayi olarak istenen us degerini giriniz");
        int us=scanner.nextInt();

        usHesaplaYazdir(sayi,us);

    }

    private static void usHesaplaYazdir(double sayi, int us) {
        int basla=1;
        double sonuc=1;

        while (basla<=us){
            sonuc*=sayi;
            basla++;

        }
        System.out.println(sayi+" uzeri "+us+" = "+sonuc);
    }
}
