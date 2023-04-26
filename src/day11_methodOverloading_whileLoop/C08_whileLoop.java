package day11_methodOverloading_whileLoop;

public class C08_whileLoop {
    public static void main(String[] args) {
        /*
        for lop mu while  loop mu
        bu sorunun cevabi yapacagimiz ise gore degisir

        dongu sayisi belli ise for loop kullanmak daha pratik tir
         ancak baslangic bitis degerleri verilmediyse veya
         dongu sayisi belli degilse while loop kullanilir
         avantajli

         */
        // 1 den 100 e kadar olan sayilari yazidirn

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");
        int sayi=1;
        while (sayi<=100){
            System.out.print(sayi+" ");
            sayi++;// unutulursa sonsuz loop olusur
        }
    }
}
