package day23_dateTime_varargs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class C04_Period {


    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1990,5,8);
        LocalDate bugun = LocalDate.now();


        System.out.println(Period.between(dogumTarihi,bugun));  // P34Y5M15D

        System.out.println(Period.between(dogumTarihi,bugun).getYears()); // 34


    }
}
