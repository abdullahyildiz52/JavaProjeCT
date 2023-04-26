package day10_nestedForLoop_methodOlusturma;

public class C11_MiniHesapMakinasi {
    public static void main(String[] args) {
        // kullanicinin verdigi iki sayi ve sececegi isleme gore
        // sonucu  bize donduren bir method olusturun
        // ornek sayılar3,5  islem 3*5 oldugunda method 15 dondurecek

        miniHesapMakinasi(5,3,'+');

        /* bize sonuc donduren methodlarda islem sonucunu gormek istersek
        direkt yazdirabilir veya
        */
        System.out.println(miniHesapMakinasi(5,4,'*'));

        // islem sonucunu kaydedip istedigimizd kullanabiliriz
        double sonuc=miniHesapMakinasi(5,4,'+');
        System.out.println(sonuc);

    }
    public static double miniHesapMakinasi(int sayi1,int sayi2,char islemSembolu) {

        // islem sembolu olarak +,-,/,* kullanilabilsin
        double sonuc=0;

        switch (islemSembolu){
            case '+':
                sonuc=sayi1*sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '*' :
                sonuc=sayi1*sayi2;
                break;
            case '/':
                sonuc=(double)sayi1/sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis sonuc 0 olarak atandi");


        }
        return sonuc;
    }
}
