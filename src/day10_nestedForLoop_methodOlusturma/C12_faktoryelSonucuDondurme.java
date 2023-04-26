package day10_nestedForLoop_methodOlusturma;

public class C12_faktoryelSonucuDondurme {
    public static void main(String[] args) {
    // verile sayini faktoryel degerinin sonucunu donduren
       // bir method olusturun

        System.out.println(faktoryelDgeridondur(5));

        int faktoryel=faktoryelDgeridondur(7);




    }
    public static int faktoryelDgeridondur(int sayi){
        int faktoryel=1;
        for (int i = sayi; i >1 ; i--) {
            faktoryel*=i;
        }
        return faktoryel;
    }

}
