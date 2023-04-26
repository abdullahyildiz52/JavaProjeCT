package day14_Arrays;

import java.util.Arrays;

public class C01_arraysKaydirmaMethodu {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(arr));
        arr=arraysSagaKaydirma(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arraysSagaKaydirma(int[] arr){

       // int[] arr  = {4, 5, 6, 7, 8};
        int sonEleman = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = sonEleman;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
