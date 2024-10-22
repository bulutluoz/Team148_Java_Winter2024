package day22_immutableClasses_dateTime;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();

        // LocalTime class'i obje olusturdugumuz satir calistiginda
        // calistigi sistemdeki zaman bilgisini alir

        // olusturulan localTime objesi bir kronometre degil
        // olusturuldugu andaki degeri saklayan basit bir variable'dir

        System.out.println("Loop'dan once localtime : "+localTime); // 11:52:29.788134


        for (int i = 0; i <1000000000 ; i++) {

            String str = ""+i+1;

        }

        localTime = LocalTime.now();
        System.out.println("Loop'dan sonra localtime : "+localTime); // 11:52:41.046534

    }
}
