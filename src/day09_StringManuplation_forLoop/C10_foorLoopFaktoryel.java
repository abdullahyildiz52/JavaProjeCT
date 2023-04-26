package day09_StringManuplation_forLoop;

public class C10_foorLoopFaktoryel {
    public static void main(String[] args) {
        /*
        verilen bir sayini nfaktoriyel degerini bulunuz

         */

        int sayi=9;
        int faktoriyel=1;

        for (int i = sayi; i>=1 ; i--) {
            faktoriyel*=i;
            System.out.println(faktoriyel);

        }
        /*
        sonucu 5!=5 * 4 * 3 * 2 * 1 seklinde uyazdirin
         */
       

        }

}

