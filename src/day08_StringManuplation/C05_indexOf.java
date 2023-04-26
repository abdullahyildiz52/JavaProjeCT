package day08_StringManuplation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java en iyisi";

        System.out.println(str.indexOf("e")); //5
       //String str = "Java en iyisi"
        System.out.println(str.indexOf("a")); //1

        //String str = "Java en iyisi"
        System.out.println(str.lastIndexOf("a")); //3

        System.out.println(str.indexOf("en")); //5

        System.out.println(str.indexOf("yi")); //9

        System.out.println(str.indexOf("iyisi")); //8
        //String str = "Java en iyisi"
        System.out.println(str.indexOf("en guzeli"));// -1 indexOf istenen yoksa -1 dondurur

        System.out.println(str.indexOf("a", 1));// 1
        System.out.println(str.indexOf("a", 2)); // 3
        //String str = "Java en iyisi"
        System.out.println(str.indexOf("i")); //8
        System.out.println(str.indexOf("i", 5)); // 8
        System.out.println(str.indexOf("i", 6)); // 8
        System.out.println(str.indexOf("i", 9)); // 10
        System.out.println(str.indexOf("i", 12)); // 12


        /* verilen bir cumlede istenen bir String icin asagidaki cumlelerden uygun
        olani yazdirn
        1- aradiginz kelime cumlede 1 kez kullenilmis
        2-aradigniz kelime cumlede 2 kere kullanilmis

         */
        // "java en iyisi" icerisinde en kelimsi

        if (str.indexOf("en") == -1) {
            System.out.println("aradiginiz kelime cumle icermiyor");
        } else {
            int birinceKelimeIndex = str.indexOf("en");
            if (str.indexOf("en", birinceKelimeIndex + 1) == -1) {
                System.out.println("bu cumlede aradiginiz kelime 1 tane var");
            } else {
                System.out.println("bu cumlede aradigniz kelime birden cok var");
            }
        }
    }
}