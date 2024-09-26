package day08_StringManipulation;

public class P09_lastIndexOf {

    public static void main(String[] args) {

/*
        lastIndexof methodu indexOf metoduna benzer fakat
        bu method sondan itibaren aranan değerin nerede olduğuna bakar
        sondan başa doğru arar fakat bulunca hangi indexte olduğunu
        baştan sayarak söyler
 */
                  //0123456789012345678901234567
        String str="Benim çok çalışmam lazım çok";

        System.out.println(str.indexOf("çok"));

        System.out.println(str.lastIndexOf("çok"));

        // Benim kelimesi ne kadar kullanılmış
        int a=str.indexOf("Benim");
        int b=str.lastIndexOf("Benim");
        
        if (a==b){
            System.out.println("Benim kelimesi 1 kere kullanılmış");
        } else{
            System.out.println("Benim kelimesi 1'den fazla kullanılmış");
        }




    }
}
