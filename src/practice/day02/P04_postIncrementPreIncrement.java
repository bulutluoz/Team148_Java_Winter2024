package practice.day02;

public class P04_postIncrementPreIncrement {
    public static void main(String[] args) {
        int a=30;
        int b=50;
        int x=40;
        int y=60;


        System.out.println(x++); // 40
        System.out.println(x); // 41

        System.out.println(++y);// 61
        System.out.println(y); // 61



        //post-increment [ Önce kullan sonra arttır ]

        int c=a++;  //Burada önce c değişkenine a değerini atadı ve sonra a değişkenini arttırdı
        System.out.println("c = " + c); //30
        System.out.println("a = " + a); //31


        //pre-increment   [ önce arttır sonra kullan ]
        int d=++b; //önce b değerini arttırdık sonra bu yeni değeri d değişkenine atadık
        System.out.println("d = " + d); // 51
        System.out.println("b = " + b); // 51


        int e=c--;
        System.out.println("e = " + e); // 30
        System.out.println("c = " + c); // 29


        int f=--d;
        System.out.println("f = " + f); // 50
        System.out.println("d = " + d); // 50






    }
}
