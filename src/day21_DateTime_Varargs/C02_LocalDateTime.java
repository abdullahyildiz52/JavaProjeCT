package day21_DateTime_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);

        LocalDate tarih2=LocalDate.ofYearDay(2024,200);
        System.out.println(tarih2);

        System.out.println(tarih.isAfter(tarih2)); // false
        System.out.println(tarih.isLeapYear()); // false
        System.out.println(tarih2.isLeapYear()); // true

        System.out.println(tarih.datesUntil(tarih2).count());

        System.out.println(tarih.getDayOfWeek()); // tuesday

        LocalDate dogumTarihi=LocalDate.of(1986,6,14);
        System.out.println(dogumTarihi.getDayOfWeek()); // saturday

        System.out.println(tarih2.lengthOfYear()); // 366

        /* kulllanician iki kisinin dogum tarihlerini alip
        hangisinin daha once dogdugunu bulan bir method olusturun
         */

    }
}
