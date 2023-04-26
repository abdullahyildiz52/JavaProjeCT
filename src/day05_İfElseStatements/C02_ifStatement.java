package day05_İfElseStatements;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen yazdırmak istediğiniz ayın ilk harfini giriniz");

        char ilkHarf=scanner.next().toUpperCase().charAt(0);

        if (ilkHarf=='o'|| ilkHarf== 'O') System.out.println("Ocak");
        if (ilkHarf=='S') System.out.println("Subat");
        if (ilkHarf=='M') System.out.println("Mart veya mayıs");
        if (ilkHarf=='N') System.out.println("Nisan");
        if (ilkHarf=='H') System.out.println("Haziran");
        if (ilkHarf=='T') System.out.println("Temmuz");
        if (ilkHarf=='A') System.out.println("Agustos veya Aralık");
        if (ilkHarf=='E') System.out.println("Eylul veya Ekim");
        if (ilkHarf=='K') System.out.println("Kasım");


    }
}
