package day23_encapsulation_inheritance;

public class C06_Parent {
    private int toplamSatisTutari;
    String strDefault="parent class strDefault";
    protected String strProtected="parent class strProtected";
    public  String strPublic="parent class strPublic";

    private void privateMethod(){
        System.out.println("parent class private method");
    }

    void defaultMethod(){
        System.out.println("parent class default method");
    }

    protected void protectedMethod(){
        System.out.println("parent class protected method");
    }

    public void publicMethod(){
        System.out.println("parent class public method");
    }
}
