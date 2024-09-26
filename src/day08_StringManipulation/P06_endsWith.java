package day08_StringManipulation;

public class P06_endsWith {
    public static void main(String[] args) {


        String str="Java öğrenmek çok zevkli";


        System.out.println(str.endsWith("i")); // true
        System.out.println(str.endsWith("zevkli")); // true
        System.out.println(str.endsWith("çok zevkli"));//true
    }
}
