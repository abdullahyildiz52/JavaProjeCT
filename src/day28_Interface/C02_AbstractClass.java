package day28_Interface;

public abstract class C02_AbstractClass {
    abstract void method1();
    void method2(){

    }

    public static void main(String[] args) {
        /*
        abstract class lar class olddukalrı için cosrtructor a sahiptirler.
        ancak abstract class lardan obje oluşturulamaz
        çünkü abstract class larda abstract methodlar olabilir bu class lardan ovbje oluşturulursa
        abstract methodlarıcalıştırmak ister ama abstract methodların bodysi olmadığı içğn bir değer üretmez
         */
       // C02_AbstractClass abstractClassObje=new C02_AbstractClass();
        // abstractClassObje.method1();
    }
}
