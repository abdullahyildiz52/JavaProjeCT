package day09_StringManuplation_forLoop;

public class C11_forloopAsalSayiTEST {
    public static void main(String[] args) {

        int sayi = 97;
        boolean asalmi = false;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                asalmi = false;
                break;
                /*
                Bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
            break; yazabilirsiniz
                 */
            } else asalmi = true;

        }

        if (asalmi) {
            System.out.println("sayi asal");
        } else {
            System.out.println("sayi asal degil");


        }
    }
}
