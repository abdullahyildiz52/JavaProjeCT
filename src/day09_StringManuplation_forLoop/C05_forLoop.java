package day09_StringManuplation_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {
        // on kere Hello World yazdirin

        String str = "Hello World ";
        System.out.println(str.repeat(10));

        // 1 den 100 e kadar olan sayilari yazdirn

        // verilen bir sayinin rakamlar toplamini bulun

        for (int i = 1; i <= 100; i++) {

            System.out.print(i + " ");

        }
        // 3 basamakli cift sayilari toplayin
        int sayilarToplami=0;
        for (int i =100; i <1000 ; i+=2) {
            sayilarToplami +=i;
            System.out.println("\n"+sayilarToplami);


        }
    }
}
