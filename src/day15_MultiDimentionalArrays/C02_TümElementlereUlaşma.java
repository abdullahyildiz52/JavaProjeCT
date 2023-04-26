package day15_MultiDimentionalArrays;

import java.util.Arrays;

public class C02_TümElementlereUlaşma {
    public static void main(String[] args) {

        int[][] arr={{1,5,9},{3,4},{2,8,1,2},{10}};

        // tek katlı Array de for loop oluştıuruyorduk
        //arr[i] tüm elemanları getiriyordu
        //MDA olunca kat sayısınca içiçe loop oluşturmaj gerekir
        // bizim sorumuzda iç içe iki loop oluşturacağız
        // arr[i][j] tüm elemanları getirir
        for (int i = 0; i < arr.length ; i++) { // outer loop u kontrol eder
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " "); // 1 5 9 3 4 2 8 1 2 10

            }


        }
        // tüm elemanların toplamını yazdırın
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("Tum elementlerin toplami : " + toplam);
        //MDA deki en büyük elementi yazdırın
        int enBuyukSayi=arr[0][0];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>enBuyukSayi){
                    enBuyukSayi=arr[i][j];

                }
            }
        }
        System.out.println(enBuyukSayi);
        // MDA daki çift sayıları yanyana

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }

            }
        }
    }
}
