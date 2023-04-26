package day20_passByValue_immiutubleClass;

public class C04_StringPool {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja"+"va";

        String s="Ja";
        String t="va";
        String str5 =s+t;
        String str6 =s.concat(t);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true
        System.out.println(str1.equals("Java")); // true

        System.out.println("=========================");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false new keywordu kontrol etmeden obje olusturur
        System.out.println(str1==str4); // true
        System.out.println(str1==str5); // false isleme sokulan var esit olmaz
        System.out.println(str1==str6); // false
        System.out.println(str1=="Java"); // true basit olusturlan metinler true verir


        /*
        java equals methodu ile icerige bakar esitse true verir
        == ise basit islemle kontrol eder deger var ise onu referans alir
        yoks obje olusturur
         */












    }
}
