package day15_MultiDimentionalArrays;

import java.util.Arrays;

public class C01_Yazdırma {
    public static void main(String[] args) {

        /*
        multi dimentional array da yazdırmaişlemi yaparken
        yazdırmak istediğimizin ne olduğuna bakmamız gerekir
        -tek katlı bir array ise Arrays.toString() kullanabilriiz
        -MDA ise Arrays.deepToString() kullanabiliriz
         */

        int[][] arr={{1,5,9},{3,4},{2,8,1,2},{10}};
        System.out.println(arr[0][0]); // 1
       // System.out.println(arr[3][2]); // .ArrayIndexOutOfBoundsException

        System.out.println(arr.length);// 4
        System.out.println(arr[1].length); // 2 {3,4}
        System.out.println(arr[3].length);// 1
        // arr[2][1].length  tek elemanın length i, olmaz
        System.out.println(Arrays.toString(arr[2]));// [2,8,1,2]
       // System.out.println(arr); // [[I@19dfb72a
        System.out.println(Arrays.toString(arr));// [[I@19dfb72a, [I@17c68925, [I@7e0ea639, [I@3d24753a]
        System.out.println(Arrays.deepToString(arr)); // [[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]

    }
}
