package day20_passByValue_immiutubleClass;

import java.util.ArrayList;
import java.util.List;

public class C02_passByvalueList {
    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("Z");
        System.out.println(harfler);
        System.out.println("method call sonrasi "+harfler);
        System.out.println("method call den donen list "+method1(harfler));
        System.out.println("metho2 call den donen list "+method2(harfler));


    }

    public static List<String> method1(List<String> harfler) {
        harfler.set(0,"T");
        harfler.set(1,"C");

        System.out.println("method1()) icinde list:"+ harfler);
        return harfler;
    }
    public static List<String> method2(List<String> harfler){
        harfler=new ArrayList<>();
        harfler.add("P");
        System.out.println("method2 icinde list "+harfler);
        return harfler;
    }
}
