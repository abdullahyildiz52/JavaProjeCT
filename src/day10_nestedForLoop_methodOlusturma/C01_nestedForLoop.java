package day10_nestedForLoop_methodOlusturma;

public class C01_nestedForLoop {
    public static void main(String[] args) {
        /* 1 den 4 e kada r olan sayilar iicn
        carpim tablosu olusturun

        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16

        */
        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + "  ");
        }
        System.out.println("");

        /*
        yukarida ki uzun kod yerine asagidaki nestedforlooop kullanilir
         */
        
        System.out.println("===================");
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j + "  ");
            }
            System.out.println("");
        }


    }
}









