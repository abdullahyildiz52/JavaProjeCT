package day08_StringManuplation;

public class C09_replace {
    public static void main(String[] args) {



        String str= "Javasiz Olmaz";
        System.out.println(str.replace('J','H')); // Havasiz Olmaz
        System.out.println(str.replace("a", "")); // Jvsiz Olmz
        System.out.println(str.replace("Javasiz", "X")); // X Olmaz
        System.out.println(str.replace("v","yayayaya")); // Jayayayayaasiz Olmaz

        System.out.println(str); // Javasiz Olmaz ( atama yapilmadigi icin baslangic degeri devam eder

        // str1 icindeki boslluklari yok edin
        String str1= "Java ile hayat cok daha guzel";
        System.out.println(str1.replace(" ", ""));
        System.out.println("str1= " +str1);
        str1=str1.replace(" ","");
        System.out.println("str1= "+str1);

        String str2= "Java hayattir";
        System.out.println(str2.replaceFirst("a", "x"));


    }
}
