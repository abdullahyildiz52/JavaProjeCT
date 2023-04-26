package day14_Arrays;

import java.util.Arrays;

public class C04_BinarySeach {
    public static void main(String[] args) {

        int[] arr={2,3,4,6,5,8,7,9,};

        /* sort yapmadan once
        System.out.println(Arrays.binarySearch(arr,6));//3
        System.out.println(Arrays.binarySearch(arr,3));//1
        System.out.println(Arrays.binarySearch(arr,4));// 2
        System.out.println(Arrays.binarySearch(arr,12)); //-9
        System.out.println(Arrays.binarySearch(arr,7));// -6

         */
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,6));// 4 index
        System.out.println(Arrays.binarySearch(arr,3));// 1 index
        System.out.println(Arrays.binarySearch(arr,4));// 2 index
        System.out.println(Arrays.binarySearch(arr,12)); // -9 lenght
        System.out.println(Arrays.binarySearch(arr,7));// 5 index
    }
}
