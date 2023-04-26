package day08_StringManuplation;

public class TestClass {
    public static void main(String[] args) {

        String str = "Java cok guzel, cok";
        System.out.println(str.lastIndexOf("g",10)); // 9
        System.out.println(str.lastIndexOf("g",5)); // -1 5.index ten once "g" yok

    }
}
