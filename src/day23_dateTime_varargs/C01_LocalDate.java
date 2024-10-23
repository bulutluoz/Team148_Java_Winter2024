package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate); //  2024-10-23


        LocalDate localDateJapan = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(localDateJapan); // 2024-10-23

        LocalDate localDateHawai = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(localDateHawai); // 2024-10-22


        LocalDate dogumGunu1 = LocalDate.of(1990,10,5);

        LocalDate dogumGunu2 = LocalDate.of(1990, Month.JULY,5);

        LocalDate baslangic = LocalDate.of(1923,10,29);




    }
}
