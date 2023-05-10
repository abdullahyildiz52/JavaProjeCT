package day27_pollymorphism_abstractClasses;

public abstract class C07_AbstractP extends C06_AbstractGP{
    /*
    abstract bir class in concrete child i

 concete olmayan abstarct child class lar parent abstract classs taki abstract methodlari
 implement etmek zorrund degildir  .isterse implement eder istemezse etmez

  ayni sekilde parent abstract class taki concrete method lari da
  isterse implement eder istemezzse etmez
     */

    void method1(){
        System.out.println("parent class concrete method1");
    }void method4(){
        System.out.println("parent class concrete method1");
    }
    abstract void method5();
    void method6(){
        System.out.println("parent class concrete method6");
    }

}
