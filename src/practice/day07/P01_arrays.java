package practice.day07;

public class P01_arrays {
    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */

    public static void main(String[] args) {

        String str="$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[]=str.split(" ");
        // arr={"$1","$23","$134","$2","$7","$24","£32","£40","£2","£65","£4"}
        int toplamDollar=0;
        int toplamPound=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                toplamDollar+=Integer.parseInt(arr[i].replace("$",""));
            }else{
                toplamPound+=Integer.parseInt(arr[i].replace("£",""));
            }

        }
        System.out.println("Dolar Toplamı: "+toplamDollar+"$");
        System.out.println("Pound Toplamı: "+toplamPound+"£");
    }
}
