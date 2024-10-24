package day24_stringBuilder_accessModifier;

public class P02_StringBuldier_Methods {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Nice have a day");


        //sb1 de yer alan degeri tersten yazdırıyoruz
        sb1.reverse();

        System.out.println(sb1);

        // sb1 tersten yazılarak ataandığı için eski haline dönmek istersek tekrar reverse() methodu kullanılmalıdır
        sb1.reverse();
        //tersinin tersi kendisidir!
        System.out.println(sb1);

        // İsim aynı olsa bile String ve StrinBuilder da uygulama faklı olabilir

        //replace metodu index alarak istenen aralıktaki metni silip yerine istediğiniz bir metni koyar
        // ilk index dahil ikinci index hariçtir
        String str="Wise";
        sb1.replace(0,4,str);
        System.out.println(sb1);

        // delete methodu iki index girilerek iki indx arasındaki veriyi siler
        // ilk index dahil ikinci index hariçtir
        sb1.delete(0,12);
        System.out.println(sb1);

        // Herhangi bir indexteki veriyi silmek amacıylar kullanılır
        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);


        //herhangi bir indexe verilen string i eklemek için kullanılır
        sb1.insert(sb1.length(),"y");
        System.out.println(sb1);

        //Verilen iindeten itibaren ilgili str değeri variable a eklenir
        sb1.insert(0,"Wise have a ");
        System.out.println(sb1);



    }
}
