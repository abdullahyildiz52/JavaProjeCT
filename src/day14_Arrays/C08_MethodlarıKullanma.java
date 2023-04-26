package day14_Arrays;

import day13_arrays.C03_ArrayinElemanlariniToplamak;
import day13_arrays.C05_arraydekiEnbuyukSayiyiBulma;
import day13_arrays.C07_TumElemanlariArtir;

import java.util.Arrays;

public class C08_MethodlarıKullanma {
    public static void main(String[] args) {

        int [] sayiArray = {2,2,7,4,2,4,5,7,3};
        // Bir arrayin bütün elemanlarina 2 ekleyin
        System.out.println(Arrays.toString(sayiArray));

       sayiArray= C07_TumElemanlariArtir.tumElemanlariArtir(sayiArray,2);
        System.out.println(Arrays.toString(sayiArray));

        C03_ArrayinElemanlariniToplamak.elemanlarinToplaminiYazdir(sayiArray);

       int enBuyukSayi=C05_arraydekiEnbuyukSayiyiBulma.enBuyukSayi(sayiArray);
        System.out.println(enBuyukSayi);

        sayiArray=C10_KullanıcıdanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(sayiArray);
        System.out.println(Arrays.toString(sayiArray));

    }
}
