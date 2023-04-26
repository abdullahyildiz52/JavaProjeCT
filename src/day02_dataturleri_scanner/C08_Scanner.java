package day02_dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /*
        soru:5 kullanıcıdan isim sooyisim yaş alıp şu formatta yazdırın
        girilen bilgiler: J Doe,44
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi soyisminizi yaşınızı giriniz");

        char isimİlkHarf= scan.nextLine().toUpperCase().charAt(0);
        String soyisim = scan.nextLine();
        int yas= scan.nextInt();

        System.out.println("girilen bilgiler: "+isimİlkHarf+" "+soyisim+","+yas);



    }
}
