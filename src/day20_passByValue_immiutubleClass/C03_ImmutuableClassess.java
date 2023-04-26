package day20_passByValue_immiutubleClass;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C03_ImmutuableClassess {
    public static void main(String[] args) {
        String str="Java Candir";
        System.out.println(str.toUpperCase());// JAVA CANDİR
        System.out.println(str);

        str.toLowerCase();
        str.replace("a","e");
        str.repeat(4);

        System.out.println(str);

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(5);

        System.out.println(sayilar);
        sayilar.set(0,10);
        System.out.println(sayilar);
    }
}
