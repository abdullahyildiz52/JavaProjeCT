package day20_passByValue_immiutubleClass;

public class C01_passByValue {
    public static void main(String[] args) {
        int sayi=20;
        sayi=method2(sayi);
        System.out.println("method2 sonrasi "+sayi);
        System.out.println(" method call sonucu "+method1(sayi));
        System.out.println("method call sonrasi "+sayi);

    }
    public static int method1(int sayi){
        sayi =25;
        System.out.println("method1 icinde sayi: "+sayi);
        return sayi;
    }
    public static int method2(int sayi){
        sayi =25;
        System.out.println("method2 icinde sayi: "+sayi);
        return sayi;
    }
}
