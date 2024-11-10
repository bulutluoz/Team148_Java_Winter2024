package day26_inheritance;

public class C06_GP {

    C06_GP(){
        System.out.println("GP parametresiz constructor calisti");
    }

    C06_GP(String s){
        this(4);
        System.out.println("GP String parametreli constructor calisti");
    }

    C06_GP(int a){
        System.out.println("GP int parametreli constructor calisti");
    }
}



