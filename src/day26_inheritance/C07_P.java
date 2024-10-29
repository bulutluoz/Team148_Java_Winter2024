package day26_inheritance;

public class C07_P extends C06_GP{

    C07_P(){
        // super();
        System.out.println("P parametresiz constructor calisti");
    }

    C07_P(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C07_P(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
    }
}
