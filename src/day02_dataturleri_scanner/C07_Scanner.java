package day02_dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /*
        kullanıcıdan ismini,soyismini ve yaşını alıp
        aşağıdaki formatta yazdırın
        Isminiz:John
        Soyisminiz:Doe
        Yasiniz:44
        Kaydınız başarıyla tamamlanmıştır.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("Isminiz:"+isim+"\nSoyisminiz: "+soyisim+"\nYaşınız: "+yas+
                "\nKaydınız tamamlanmıştır");




    }
}
