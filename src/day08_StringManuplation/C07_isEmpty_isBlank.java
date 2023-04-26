package day08_StringManuplation;

public class C07_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false

        str= "      ";

        System.out.println(str.isEmpty()); // false ( bos mu)
        System.out.println(str.isBlank()); // true (bosluklardan mi olusuyor)

        str ="";

        System.out.println(str.isEmpty()); // true
        System.out.println(str.isBlank()); // true

        System.out.println(str.length());  // 0

    }
}
