package day23_encapsulation_inheritance;

public class C07_ChildClass extends C06_Parent{

    public static void main(String[] args) {
        C04_EncapsuleClass objBaskaClass=new C04_EncapsuleClass();
        System.out.println(objBaskaClass.publicStr);

        C07_ChildClass objKendiClass=new C07_ChildClass();
        System.out.println(objKendiClass.strPublic);  // parent class strPublic
        System.out.println(objKendiClass.strDefault); //parent class strDefault
        System.out.println(objKendiClass.strProtected); //parent class strProtected
       //  System.out.println(objKendiClass.strPrivate);
          /*
    java da child class lar parent edinir
    eger bir class taki tum iozelliklere otomatik olarak sahio olmak
    isterseni o classi extend keyword u kullanarak parent edinebilirsiniz

    baska bir class dan obje olusturarak o class daki class uyelerini kullanmak
    INHERITANCE degildir

    bir child class access modifier goc onunde bulundurularak parent class daki tum
    ozelliklere otomatik olarak sahip olur.

    parent class daki
    - private class uyeleri: inherit edilemez
    - default class uyeleri: sadec ayni package icindeyse inherit edileibilr
    -protected class uyeleri: her yerden inherit edilebilir
    - public class uyeleri : her yerden inhereit edilebiilir
                              public olanlar sadece child classlardan degil tum classlardan ulasilabirl
                              babanin malinin herkese acik olmasi gibi

     parent-child iliskisi olan class'larda kullanilacak
        en ideal access modifier PROTECTED'dir.
        Parent-Child iliskisi 2 durumda kullanilir
        1- Eger bir projeyi sifirdan olusturuyorsaniz
           Tasarim asamasinda parent-child class'lari dusunup
           uygulamayi ona gore gelistirebiliriz
           boylece reusability ve kolay maintenance saglanir
        2- Sonradan bir class olusturuldugunda
           daha onceden olusturulmus bir class'daki
           tum ozelliklere sahip olmasi istenirse
           o class'a child yapabiliriz.
        - Bir child class parent cclass'daki tum ozelliklere otomatik olarak sahip olur
        - Isterse parent class'daki ozelliklerden bazilarini kendisine uyarlar
        - Isterse de parent classlarinda olmayan yeni ozellikler ekleyebilir


     */
    }
    public void publicMethod(){
        System.out.println("child class public method");

    }

}
