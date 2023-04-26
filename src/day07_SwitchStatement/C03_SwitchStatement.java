package day07_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchStatement {
    public static void main(String[] args) {
       // /*kullanıcıdan 2 basamaklı bir sayı alıp girilen sayıyı yazı ile yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("2 basamaklı bir sayı giriniz");
        int sayi=scanner.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Gecerli bir rakam giriniz");




        }



    }

 }

