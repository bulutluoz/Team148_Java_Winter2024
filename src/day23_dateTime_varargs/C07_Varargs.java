package day23_dateTime_varargs;

public class C07_Varargs {

    public static void main(String[] args) {

        elemanYazdir("ali",1,2,3,4,5); // 3
        elemanYazdir("Veli",1,2,3,4,5,6); // 4
        // elemanYazdir("Java",1,2); // ArrayIndexOutOfBoundsException

    }


    public static void elemanYazdir(String s , int... v){

        System.out.println( v[s.length()-1] );

    }

}

