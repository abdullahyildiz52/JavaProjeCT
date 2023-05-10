package day27_pollymorphism_abstractClasses;

public class C04_Toyota extends C03_Araba{
    public static void main(String[] args) {
        /*
        satisa cikan tum araclar icin somut degerler atanmali
        child  class lar parent class daki tum method lari override etmek zorunda olsun

        normal parent child iliskisinde mecburiyet yoktur
        child isterse override eder id=steemzse etmez

        ABSTRACTION un temel amaci child class alrn mutlaka kendisinie uyalamasi geeken mthodlaari
        override edilkmsini saglamakrtir

        bir class abstract yapilip icerisine abstract methodlar knursa o class i parent edinen tum child classlar
        parent class daki abstract methotlari override etmelidir
         aksi durumda cte olusur

         */
        C04_Toyota arac1=new C04_Toyota();
        arac1.teker(); // tum arabalaarin tekeeri olmalidir
        arac1.klima();
        arac1.motor();

    }

    @Override
    void teker() {

    }

    @Override
    void motor() {

    }

    @Override
    void gosterge() {

    }
}
