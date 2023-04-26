package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
   /*
   kullanicidan toplanmak uzeres sayi alin toplam 500 olur veya gecerse
   deger almayi durdurup
   kac sayi girildigini
   ve toplamin kac olldugunu yazirin
    */
        Scanner scanner = new Scanner(System.in);


        int toplam = 0;
        int sayiadedi=0;

        while(toplam<=500){
            System.out.println("lutfen bir sayi giriniz");
            int sayi= scanner.nextInt();
            toplam+=sayi;
            sayiadedi++;


        }
        System.out.println("sayilarin toplami;"+toplam);
        System.out.println("girilen sayi adedi:"+sayiadedi);
        System.out.println(sayiadedi+"tane sainin toplami;"+toplam);

    }
}
