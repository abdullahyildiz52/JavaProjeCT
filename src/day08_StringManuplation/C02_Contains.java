package day08_StringManuplation;

public class C02_Contains {
    public static void main(String[] args) {
        String str="Java ile hersey cok kolay";

        System.out.println(str.contains("java"));// false

        System.out.println(str.contains("Java"));// true

        String arananKelime="cok";
        System.out.println(str.contains(arananKelime));//true

        String olmayanKelime="Deniz";
        System.out.println(str.contains(olmayanKelime));// false

        System.out.println(str.contains("a"));//true

        System.out.println(str.contains(""));// iki harf arasinda hicbirsey var (true)


    }
}
