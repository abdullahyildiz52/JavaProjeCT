package day14_Arrays;

import java.util.Arrays;

public class C03_enBuyukElemanYazdirma {
    public static void main(String[] args) {
        /*
        bir array in en buyuk ve enkucuk elemanlaini yadiran memthod
         */

        int[] arr={3,5,6,7,2,9,6,8,1,11,1,2,14,65,9,8,78};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        enBuyukVeEnKucukelemanlariYazdirma(arr);

    }
    public static void enBuyukVeEnKucukelemanlariYazdirma(int[] arr){
        Arrays.sort(arr);
        System.out.println("Array in en kucuk elemani:"+arr[0]);
        System.out.println("Array in en buyuk elemani:"+arr[arr.length-1]);
    }
}
