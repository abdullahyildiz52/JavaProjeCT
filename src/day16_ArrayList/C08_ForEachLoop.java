package day16_ArrayList;

public class C08_ForEachLoop {
    /*
    soru 2 ) Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        int[] arr={3,5,4,3,4};

        arrKarelerToplami(arr);

    }
    public static void arrKarelerToplami(int[] arr){
        int toplam=0;
        for (int each: arr
             ) {
            toplam+=each*each;

        }
        System.out.println("array in elemanlari kareleri toplami "+toplam);
    }
}
