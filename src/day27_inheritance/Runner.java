package day27_inheritance;

public class Runner {
    public static void main(String[] args) {


        C08_AvciKuslar avciKus1=new C08_AvciKuslar();

        avciKus1.beslenme(); // et yerler
        avciKus1.omur(); // yasar ve olurler
        avciKus1.kanat(); // kanatlidirlar
        avciKus1.gaga();  // sivri gagali
        avciKus1.cogalma(); // yumurtayla cogalirlar
        avciKus1.hareket();// ucarlar
        avciKus1.pence(); //   pencelidir
        avciKus1.solunum(); // akcigerle nefes alirlar
        System.out.println("-------------------------------------");


        C07_Kuslar avciKus2=new C08_AvciKuslar();

        avciKus2.beslenme(); // et yerler AVK
        avciKus2.omur(); // yasar ve olurler H
        avciKus2.kanat(); // kanatlidirlar K
        avciKus2.gaga();  // sivri gagali K
        avciKus2.cogalma(); // yumurtayla cogalirlar K
        avciKus2.hareket();// ucarlar AVK
        //avciKus2.pence(); //   CTE
        avciKus2.solunum(); // akcigerle nefes alirlar
        System.out.println("-------------------------------------");

        C06_Hayvanlar avciKus3=new C08_AvciKuslar();
        avciKus3.beslenme(); // et yerler AVK
        avciKus3.omur(); // yasar ve olurler H
        // avciKus3.kanat(); // CTE
        // avciKus3.gaga();  // CTE
        avciKus3.cogalma(); // yumurtayla cogalirlar K
        avciKus3.hareket();// ucarlar AVK
        // avciKus3.pence(); //   CTE
        avciKus3.solunum(); // akcigerle nefes alirlar

        System.out.println("-------------------------------------");

        C07_Kuslar kus1=new C07_Kuslar();
        kus1.omur(); // yasar ve olurler H
        kus1.beslenme(); //beslenirler
        kus1.hareket(); //hareket ederler
        kus1.solunum();// akcigerle nefes alırlar
        kus1.gaga(); //gagalari vardır
        kus1.cogalma(); //yumurtayla cogalirlar
        kus1.kanat();//kanatlıdırlar
        //kus1.pence(); //CTE


    }
}
