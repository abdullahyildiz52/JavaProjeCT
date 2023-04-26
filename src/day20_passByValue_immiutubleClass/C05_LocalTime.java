package day20_passByValue_immiutubleClass;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {
    public static void main(String[] args) {
        /*
        java da zamanla ilgiil pek cok class vardir
        biz 3 class gorecegiz
        LocalTime classi saat ile ilgili methodlar icerir

         */
        LocalTime saatbaslangic=LocalTime.now();

        //LocalTime.now() bulundugu satir calistiginda bilgisayarin saatini alip lakaydeder
        // saat variable i canli bir kronometre degiildir
        //bulunudugu satirin calistigi zamani kaydeden bir variable dir

        System.out.println(saatbaslangic); // 13:42:33.430371600
        int toplam=0;
        for (int i = 0; i <=50000 ; i++) {
            toplam+=i;


        }
        System.out.println(toplam);
        LocalTime saatbitis=LocalTime.now(); //

        System.out.println(saatbitis); // 13:42:33.433372200

        LocalTime saat=LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(saat); // 13:42:33.435371600

        LocalTime saat2=LocalTime.of(11,28,25);
        System.out.println(saat2); // 11:28:25

        LocalTime saat3=LocalTime.ofSecondOfDay(10000);
        System.out.println(saat3); // 02:46:40
    }
}
