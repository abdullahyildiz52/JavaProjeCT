package day03_dataCasting_WrapperClass;

public class C06_İşlemÖnceliği {
    public static void main(String[] args) {
        System.out.println(8*5+2*(12/4)-19);

        System.out.println(24/6*2-7*4+9);

        System.out.println(35/5); //7
        System.out.println(20/8); //2

        double db1 =20;
        System.out.println(db1/8);//2,5

        int sayi1= 20;
        int sayi2 =8;

        System.out.println((double) (sayi1/sayi2));
    }
}
