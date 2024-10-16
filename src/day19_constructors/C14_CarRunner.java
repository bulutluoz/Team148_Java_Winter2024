package day19_constructors;

public class C14_CarRunner {

    public static void main(String[] args) {

        C13_Car car1 = new C13_Car("Mercedes","A200");

        System.out.println(car1.marka); // Mercedes
        System.out.println(car1.model); // A200


        C13_Car car2 = new C13_Car("Audi","A4",2020);

        System.out.println(car2.marka); // Audi
        System.out.println(car2.model); // A4
        System.out.println(car2.yil); // 2020

        C13_Car car3 = new C13_Car("Ford","Taurus","Mavi",1990,2000);

        System.out.println(car3.marka); //
        System.out.println(car3.model); //
        System.out.println(car3.yil); //

    }
}
