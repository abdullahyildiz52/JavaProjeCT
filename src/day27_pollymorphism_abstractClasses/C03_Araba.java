package day27_pollymorphism_abstractClasses;

public abstract class C03_Araba {
    /*
    eger parent class ta istedihgimiz hehangi bir mahtodu child class larin tumu oveerride
    etmek zorunda kalsin  istiyorsak   o  meethodu astract yapariz

     Eger abstract yapilan bir method
        tum child class'lar tarafindan OVERRIDE edilecekse
        parent class'daki abstract method
        hic bir zaman CALISMAYACAKTIR
        override edildigi icin guncel olan
        child class'lardaki overriding method'lar calisacaktir
        o zaman abstract method'larin body'ye ihtiyaci YOKTUR
     */
    abstract void teker();


    abstract void motor();

    abstract void gosterge();

    void guvenlik(){
        System.out.println("tum arabalarin guvenlik olmalidir");
    }void klima(){
        System.out.println("tum arabalarin klima olmalidir");
    }
}
