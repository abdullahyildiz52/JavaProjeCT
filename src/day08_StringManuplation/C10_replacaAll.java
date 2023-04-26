package day08_StringManuplation;

public class C10_replacaAll {
    public static void main(String[] args) {
        // icindeki tum sayilari temizleyin

        String str ="J1551fdf5f1gf5djsdgfavgasdhjjkv4584";
        /* elementlerin ortak ozellikelrinin kulllanrak

         */
        System.out.println(str.replaceAll("\\d", ""));

    }
}
