package day13_arrays;

public class C05_arraydekiEnbuyukSayiyiBulma {
    // verilen int arraydeki en buyk sayiyi bize donduren bir method yazin

     int[] arr = {2, 4, 6, 8, 1, 3, 7, 5};


    public static void main(String[] args) {

        // Verilen int array'deki en buyuk sayiyi bize donduren bir method olusturun
        int[] arr = {2,4,6,8,1,3,7,5};
        System.out.println(enBuyukSayi(arr));
    }
    public static int enBuyukSayi(int[] arr) {
        int enBuyuk = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
            }
        }
        return enBuyuk;
    }
}
