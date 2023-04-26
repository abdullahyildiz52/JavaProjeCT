package day06_nestedifElseStatement_ternaryOperator;

public class C06_Ternary {
    public static void main(String[] args) {

        // Verilen sayi pozitif ise degerini 2 katina cikarin
        // pozitif degil ise degerini 10 artirin

        int sayi = 10;
        sayi = sayi>0 ? 2*sayi : sayi+10 ;
        // Ternary bize sonuc verir, bu sonucu ya direk yazdirmaliyiz veya variable'a atamaliyiz
        System.out.println(sayi);
          sayi++;
        // sayıçift ise 2 katını yazdırın tek ise "sayı tek" yazdırın
        System.out.println(sayi % 2 == 0 ? sayi * 2 : "sayı tek");

        // Ternary bize sonuc verir, bu sonucu ya direk yazdirmaliyiz veya variable'a atamaliyiz
        System.out.println(sayi);
    }
}

