package day31_Iterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {


        Queue<String> yemekSirasi = new LinkedList<>();
        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammed");

        // Murat ile Muhammed'in arasina bir eleman ekleyelim
        yemekSirasi.add("Abdullah");
        // queue ozelliginden dolayi, araya eleman EKLENEMEZ
        System.out.println(yemekSirasi); // [Murat, Muhammed, Abdullah]

        System.out.println(yemekSirasi.remove());// Murat
        // bastakini siler ve bize dondurur
        System.out.println(yemekSirasi); // [Muhammed, Abdullah]

        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");

        System.out.println(yemekSirasi); // [Muhammed, Abdullah, Sevda, Veysel, Aysegul]
        System.out.println(yemekSirasi.poll()); // Muhammed
        // video da 1:37:37




    }

}
