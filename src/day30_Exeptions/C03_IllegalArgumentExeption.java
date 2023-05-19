package day30_Exeptions;

import java.util.Scanner;

public class C03_IllegalArgumentExeption {
    public static void main(String[] args) {

        // kullanicidan yasini alip
        // 65'den buyukse emekli olabilecegini yazdirin
        // eger kullanici 20'den kucuk bir yas girerse
        // exception firlatin ve emeklilik islemleri olan kodlari atlayin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas=scanner.nextInt();

        try {
            if (yas<20){
                throw new IllegalArgumentException("yaş 20 den küçük olamaz");
            } else if (yas<65) {
                System.out.println("Emekli olmaniza " + (65-yas) + " sene var");

            }else {
                System.out.println("Emekli olabiblirsiniz");
            }

            System.out.println("Emeklilik işlemleri 1");
            System.out.println("Emeklilik işlemleri 2");
            System.out.println("Emeklilik işlemleri 3");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}
