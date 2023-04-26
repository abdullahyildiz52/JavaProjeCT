package day04_İncrement_Concatenation;

public class C04_Concatination {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int i1 = 3;
        int i2 = 4;

        // Sadece bu variable'lari kullanarak
        // asagida verilen metinleri yazdirin


        // 34 Candir
        System.out.println(s4 + i1 + i2 + s3 + s2); //s4 ("") int değeri ile toplayarak int Stringleştiriyor

        // 12 Java
        System.out.println(i1 * i2 + s3+ s1); // 12 Java

        //  Java 7
        System.out.println(s1+s3+(i1+i2)); // Java 7

        // Java 34
        System.out.println(s1+s3+i1+i2); // Java 34

        // Java Candir
        System.out.println(s1+s3+s2); // Java Candir

    }
}
