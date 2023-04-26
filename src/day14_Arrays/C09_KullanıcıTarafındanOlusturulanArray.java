package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanıcıTarafındanOlusturulanArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //  1 kullanıcıdan array bıyutu alın
        System.out.println("lütfen array boyutunu giriniz");
        int ArrayBoyut=scanner.nextInt();
        int[] arr=new int[ArrayBoyut];

        int arrayElementi=0;
        // array in boyutu kadar loop ile arrray in elemanlarını alıyoruz

        for (int i = 0; i <ArrayBoyut ; i++) {
            System.out.println("lütfen array in "+i+ "in ci elemanını girin");
            arrayElementi=scanner.nextInt();
            arr[i]=arrayElementi;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] kullanıcıArrayOlusturma() {
        Scanner scanner = new Scanner(System.in);
        //  1 kullanıcıdan array bıyutu alın
        System.out.println("lütfen array boyutunu giriniz");
        int ArrayBoyut = scanner.nextInt();
        int[] arr = new int[ArrayBoyut];

        int arrayElementi = 0;
        // array in boyutu kadar loop ile arrray in elemanlarını alıyoruz

        for (int i = 0; i < ArrayBoyut; i++) {
            System.out.println("lütfen array in " + i + "in ci elemanını girin");
            arrayElementi = scanner.nextInt();
            arr[i] = arrayElementi;

        }
        return arr;
    }
}
