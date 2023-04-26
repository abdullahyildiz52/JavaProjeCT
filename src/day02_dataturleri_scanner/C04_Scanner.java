package day02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //kullanıcıdan bir değer alın
        // girilen sayının 2 katını yazdırın

        Scanner scan = new Scanner(System.in);

        // kullanıcıdan bir değer isteyin

        System.out.println("lütfen bir tamsayı giriniz");

        // kullanıcıdan uygun data türüne göre bir variable oluşturun
        //oluşturduğunuz variable a atayın

        int girilenSayi = scan.nextInt();

        System.out.println("Girdiğiniz sayının 2 katı:"+2*girilenSayi);



    }
}
