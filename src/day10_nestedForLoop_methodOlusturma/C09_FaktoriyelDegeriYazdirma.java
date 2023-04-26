package day10_nestedForLoop_methodOlusturma;

public class C09_FaktoriyelDegeriYazdirma {
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryel degerini yazdiran
        // bir method olusturun

    faktoriyelDegeriYazdir(4);

    }
    public static void faktoriyelDegeriYazdir(int sayi){
        int faktoriyel=1;

        for (int i = sayi; i >=sayi ; i--) {

            faktoriyel*=i;

        }

        System.out.println(sayi+"!="+faktoriyel);
    }
}
