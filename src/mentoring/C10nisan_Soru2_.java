package mentoring;

import java.util.Scanner;

public class C10nisan_Soru2_ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen baslangic sayisini girin");
        int baslangic=scanner.nextInt();

        System.out.println("lutfen bitis degerini girin");
        int bitis=scanner.nextInt();

        System.out.println("lutfen artis miktarini girin");
        int artis=scanner.nextInt();

        for (int i = baslangic; i <bitis ; i+=artis) {
            System.out.print(i+" ");

        }

    }
}
