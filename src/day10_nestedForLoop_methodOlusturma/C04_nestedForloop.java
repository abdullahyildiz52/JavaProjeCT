package day10_nestedForLoop_methodOlusturma;

public class C04_nestedForloop {
    public static void main(String[] args) {
        /*
        verilern bir sayi icin asagidaki sekli olusturun

        int sayi =4

        1
        1 2
        1 2 3
        1 2 3 4

         */
        int sayi=4;


        for (int i = 1; i <=sayi ; i++) { // outer ==> satirlari
            for (int j = 1; j <=i ; j++) { // inner ==> sutunlari
                System.out.print(j+" ");
            }
            System.out.println("");
        }


    }

}
