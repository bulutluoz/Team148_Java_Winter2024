package day26_inheritance;

public class C08_Child extends C07_P{

    C08_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }

    C08_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }

    C08_Child(int a){
        System.out.println("C int parametreli constructor calisti");
    }
}
