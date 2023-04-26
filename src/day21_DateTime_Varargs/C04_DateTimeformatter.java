package day21_DateTime_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeformatter {
    public static void main(String[] args) {

                /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar


         */
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm");
        LocalDateTime ts=LocalDateTime.now();
        System.out.println(ts); // 2023-04-25T12:18:07.281945400
        System.out.println(ts.format(dtf1)); // 25/Nisan/2023 12:19

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d.M.yy HH:mm");
        System.out.println(ts.format(dtf2)); // 25.4.23 12:20
    }
}
