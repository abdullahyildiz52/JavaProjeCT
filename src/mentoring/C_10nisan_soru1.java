package mentoring;

import java.util.Scanner;

public class C_10nisan_soru1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk  bir sayi giriniz");
        int sayi=scanner.nextInt();


        if (sayi<100){

           for (int i = 1; i <=sayi ; i++) {


               if (i % 3 == 0) {
                   System.out.println("Java");
               } else if (i % 5 == 0) {
                   System.out.println("Guzeldir");
               } else if (i % 15 == 0) {
                   System.out.println("Java Guzeldir");
               } else System.out.println(i);
           }
        }else System.out.println("gecersiz sayi");

    }
}

