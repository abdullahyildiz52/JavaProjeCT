package day27_pollymorphism_abstractClasses;

public class C05_Nissan extends C03_Araba{
    /*
    Abstract class lar yokken class larimiza ozek bir isim vermemistik
    ama abstract clss lar devreye girince
    class turunu belirtmek icin abstract olmasyan   c;ass lara concrete class deir

    bu gune kadar bizim olsturdugumuz  tum class lar concrete class idi
    concrete class/method lara concrete yazilmaz
    sadece class/method dan bahsedillirken abstract olmadigini vurgulamak icin concrete class deriz.
     */



    @Override
    void teker() {
        System.out.println("nissan araclar lassa kullanir");

    }

    @Override
    void motor() {
        System.out.println("nissan araclar reno motorlar kullanir");

    }

    @Override
    void gosterge() {
        System.out.println("nissan araclarda 20 tane gosterge vardir");

    }

    public static void main(String[] args) {
        C05_Nissan nissan1 = new C05_Nissan();
        nissan1.gosterge(); // nissan araclarda 20 tane gosterge vardir
        nissan1.guvenlik(); // tum arabalarin guvenlik olmalidir
        nissan1.klima(); //tum arabalarin klima olmalidir
        nissan1.motor();// nissan araclar reno motorlar kullanir
        nissan1.teker(); // nissan araclar lassa kullanir

        C03_Araba nissan2 = new C05_Nissan();
        nissan2.gosterge();//nissan araclarda 20 tane gosterge vardir
        nissan2.guvenlik(); //tum arabalarin guvenlik olmalidir
        nissan2.klima(); //tum arabalarin klima olmalidir
        nissan2.motor(); //nissan araclar reno motorlar kullanir
        nissan2.teker();// nissan araclar lassa kullanir
    }
}
