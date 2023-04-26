package day21_DateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1986,6,14);
        LocalDate bugun=LocalDate.now();

        Period yasAbdullah=Period.between(dogumTarihi,bugun);
        System.out.println(yasAbdullah); // P36Y10M11D

        System.out.println("abdullah in yasi :"+yasAbdullah.getYears() ); // abdullah in yasi :36
    }
}
