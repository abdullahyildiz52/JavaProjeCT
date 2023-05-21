package day31_Iterator_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        // double ended queue
        // genel olarak queue ozelliklerini gosterir
        // ancak bastan ve sondan ekleme-cikarma gibi ozellikler olur
        Deque<String> dec=new LinkedList<>();
        dec.add("Adnan");
        dec.add("Sevda");
        System.out.println(dec);  //[Adnan, Sevda]
        dec.addFirst("Sayda");
        System.out.println(dec); //[Sayda, Adnan, Sevda]
        System.out.println(dec.removeLastOccurrence("Sevda")); // true
        System.out.println(dec.removeLastOccurrence("Abdullah")); // false
        System.out.println(dec); //[Sayda, Adnan]

        // tek sevda oldugu icin remove(Obj), removeFirstOccurance(Obj) veya lastOccurance(Obj) fark olmaz
        System.out.println(dec.pop()); // Sayda
        System.out.println(dec); // [Adnan]
        // ilk elementi siler ve bize dondurur removeFirst()'e benzer

        Deque<String> bosDeq= new LinkedList<>();
       // bosDeq.removeFirst(); // NoSuchElementException
        // bosDeq.pop();// NoSuchElementException






    }
}
