package day05_İfElseStatements;

import java.util.Scanner;

public class C08_ifElseStatements {
    public static void main(String[] args) {
        /*
        kullanıcıda bir karakter girmesini isteyin
        girilen karakterinn büyük harfa olup olmadığını yazdırın
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir karakter giriniz");

        char karakter= scanner.next().charAt(0);

        if ('A'<=karakter&& karakter<= 'Z' ) {
            System.out.println("Girilen karakter büyük harf");
        }
        else {
            System.out.println("Girilen karakter büyükharf değil");
        }
    }
}
