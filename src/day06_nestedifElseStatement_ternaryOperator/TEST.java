package day06_nestedifElseStatement_ternaryOperator;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("sifre girin");

        String sifre = scan.nextLine();

        char ilkHarf = sifre.charAt(0);



        if(ilkHarf>='A' && ilkHarf<='Z') {

            if(ilkHarf=='A') {

                System.out.println("Gecerli");

            }else {

                System.out.println("Gecersiz");

            }

        }else if(ilkHarf>='a' && ilkHarf<='z') {

            if(ilkHarf=='z') {

                System.out.println("Gecerli");

            }else {

                System.out.println("Gecersiz");

            }

        }else {

            System.out.println("Yanlis giris");

        }

        //Asagidakilerden hangisi yanlistir?
    }
}
