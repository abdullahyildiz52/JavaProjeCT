package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C08_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı Bir tamsayı girin");
        int sayi= scan.nextInt();
        System.out.println((sayi%10)+(sayi/10%10)+(sayi/100));//213 için 6

       // veya


        int birlerBas=0;
        int rakamlarToplami=0;

        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;

        sayi=sayi/10;
        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;

        sayi=sayi/10;
        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;

        System.out.println(rakamlarToplami);



    }
}
