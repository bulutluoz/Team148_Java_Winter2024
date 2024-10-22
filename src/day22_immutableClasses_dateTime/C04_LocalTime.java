package day22_immutableClasses_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime localTimeBaslangic = LocalTime.now();

        // LocalTime class'i obje olusturdugumuz satir calistiginda
        // calistigi sistemdeki zaman bilgisini alir

        // olusturulan localTime objesi bir kronometre degil
        // olusturuldugu andaki degeri saklayan basit bir variable'dir

        System.out.println("Loop'dan once localtime : "+localTimeBaslangic); // 11:52:29.788134


        for (int i = 0; i <500000000 ; i++) {

            String str = ""+i+1;

        }

        LocalTime localTimeBitis = LocalTime.now();
        System.out.println("Loop'dan sonra localtime : "+localTimeBitis); // 11:52:41.046534

        System.out.println((localTimeBitis.getSecond() - localTimeBaslangic.getSecond()));

        // .get..  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi bize getirir

        System.out.println(Duration.between(localTimeBaslangic, localTimeBitis)); // PT11.355606S

        // .with..  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istedigimiz deger olarak ayarlar
        System.out.println(localTimeBitis.withHour(20)); // 20:14:32.627315
        System.out.println(localTimeBitis.withMinute(0));  // 12:00:32.347180
        System.out.println(localTimeBitis.withSecond(0).withNano(0)); // 12:16

        // .plus.. veya .minus..  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istedgimiz deger kadar ileri veya geriye alir

        System.out.println(localTimeBitis.plusHours(29).plusMinutes(17));
        // 17:35:41.298407

        System.out.println(localTimeBitis.minusHours(217)); // 11:18:41.298407



        System.out.println(localTimeBaslangic.toSecondOfDay()); // 44461
        // gunun baslangici olan 00:00 'dan localTimeBaslangic zamanina kadar gecen toplam saniye
        System.out.println(localTimeBaslangic.toNanoOfDay());// 44461296098000
        // gunun baslangici olan 00:00 'dan localTimeBaslangic zamanina kadar gecen toplam nanosaniye



        // yukardaki loop islem suresini baslangic ve bitis saniyeleri ile bulalim

        System.out.println(localTimeBitis.toSecondOfDay() - localTimeBaslangic.toSecondOfDay());
        // 5


        // yukardaki loop islem suresini baslangic ve bitis nanosaniyeleri ile bulalim

        System.out.println(localTimeBitis.toNanoOfDay() - localTimeBaslangic.toNanoOfDay());
        // 5 saniye 629984000 nanosaniye




    }
}
