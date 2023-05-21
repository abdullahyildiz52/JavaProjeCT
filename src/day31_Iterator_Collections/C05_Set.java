package day31_Iterator_Collections;

import java.util.HashSet;
import java.util.Set;

public class C05_Set {
    public static void main(String[] args) {
        Set<String> sinifList=new HashSet<>();
        sinifList.add("Sara");
        sinifList.add("Sevda");
        System.out.println(sinifList); //[Sevda, Sara]

        sinifList.add("Sevda"); //
        System.out.println(sinifList); // [Sevda, Sara]

        sinifList.iterator();
        System.out.println(sinifList); // [Sevda, Sara]

    }
}
