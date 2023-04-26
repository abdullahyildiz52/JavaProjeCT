package day08_StringManuplation;

public class C03_StartsWith_EndsWith {
    public static void main(String[] args) {
        /* bir yazinin (str) bir yazi parcacigi ile baslayip baslamadigini test ederek
        true veya false dondurur
         */
        String str="Java cok eglenceli";

        System.out.println(str.startsWith("java"));// false
        System.out.println(str.startsWith("Java"));// true
        System.out.println(str.startsWith(str));// true her yazi kendisiyle baslar kendisiylen biter
        System.out.println(str.startsWith(""));//true herseyin basinda bir sey vardir

        System.out.println("=====================================================");
        /* entwith metodu istelin bir string parcacigi ile bitip bitmeddigigni kontrol eder

         */
        System.out.println(str.endsWith("a")); //false
        System.out.println(str.endsWith("eglenceli"));// true
        System.out.println(str.endsWith("celi"));// true
        System.out.println(str.endsWith("Java cok eglenceli"));// true

        System.out.println(str.length());// 18

        System.out.println(str.substring(str.length()-3));// eli
        System.out.println(str.endsWith(str.substring(str.length()-3)));//true


    }
}
