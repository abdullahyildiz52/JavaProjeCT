package day08_StringManuplation;

import java.util.Scanner;

public class C04_StringManuplationSoru {
    public static void main(String[] args) {
        /* kulllanicidan bir mail alin
       - mail @ icermiyorsa "Gecersiz mail"
       - mail @gmail.com icermiyorsa "mail gmail olmali"
       -mail @gmail.com ile bitmiyorsa "mail de yazim hatasi var"
        yazdirin
         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir mail adresi giriniz");

        String mail=scanner.nextLine();

        if (mail.contains("@")==false) {

            System.out.println("Gecersiz mail");
        }else if (mail.contains("@gmail.com")==false) {
            System.out.println("mail gmail olmali");

        } else if (mail.endsWith("@gmail.com")==false) {
            System.out.println("mail de yazim hatasi var");

        }else System.out.println("Email basarili");

        /*
        eger kodlari ayri ayri birbirinden bagimsiz kontrol etmek istiiyorsak
         if (mail.contains("@")==false) {

            System.out.println("Gecersiz mail");
        } if (mail.contains("@gmail.com")==false) {
            System.out.println("mail gmail olmali");

        } if (mail.endsWith("@gmail.com")==false) {
            System.out.println("mail de yazim hatasi var");

        }else System.out.println("Email basarili");
         */

    }
}

