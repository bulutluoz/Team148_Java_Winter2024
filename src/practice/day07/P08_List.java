package practice.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P08_List {
    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.
    public static void main(String[] args) {

        List<Double> not = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.print("Not girmek istiyor musunuz: ( E / H ): ");
        char devam=scan.next().toUpperCase().charAt(0);
        double toplam=0;
        double ortalama=toplam/not.size();
        while(devam=='E'){
            System.out.print("Notu Giriniz: ");
            not.add(scan.nextDouble()); //her not girdiğinde list'e yeni eleman olarak notu ekleyecek
            System.out.print("Yeni Not Girecek misiniz ( E / H ): ");
            devam=scan.next().toUpperCase().charAt(0);
        }

        for (int i = 0; i < not.size(); i++) {
            toplam+=not.get(i);
        }


        System.out.println("Girilen Notların ortalaması: "+ortalama);

        List<Double> ortGecen=new ArrayList<>();
        for(Double eleman:not){
            if (eleman>ortalama){
                ortGecen.add(eleman);
            }
        }

        System.out.println("Ortalamanın üstündeki öğrenci sayısı: "+ortGecen.size());
    }
}