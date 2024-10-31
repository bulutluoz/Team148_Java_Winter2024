package day28_overridingPolymorphism;

public class C05_Child extends C04_Parent {

    public void method1(int sayi1) {
        // Child class'ta parent class'tan bir methodu
        // override etmek istersek
        //öncelikli olarak parent class ile
        // aynı signature'a sahip bir method oluşturulabilir
        //siganture farklı olursa
        // ismin aynı olması override sağlamaz

    }


    public void method2() {

    }

    @Override
    public void method3() {
     // override method oluşturmak için
     // @Override notasyonu kullanılabilir
     // fakat bu notasyonu kullanmak zorunlu değildir.
     // Override notasyonu intellij tarafından otomatik oluşturulur.
     // bu notasyon parent class'taki override edilen methodu takip eder
     // Eğer silinir veya değiştirilirse override işlemi geçersiz olur.
     // Bu geçersizlik nedeniyle de @Override notasyonu sayesinde CTE verir
     // Notasyon kullanılmayan override işleminde
     // parent class'taki method takip edilmez
     // silinmesi ya da değişmesi durumunda
     // Overrriding özelliği biter faka kod çalışmaya devam eder.
     // Değişme ya da silinme sonucu CTE verdiren body kısmı değil
     // signature kısmıdır.

    }


     public static void method4()    {

        // static olarak işaretlenen methodlar override edilemezler
        // child class'ta aynı signature sahip bir method oluşur
        // ama bu ikisi override ilşkisi kurmazlar
        // her nekadar signature'ları aynı olsa da static olarak işaretlendikleri için
        // birbirnden bağımsız iki farklı method olarak çalışırlar

        // parent class'ta static olarak işaretlenmiş bir methdu
        // child clas içinde aynı signature kullanılarak
        // static keyword kullanılmadan OLUŞTURAMAZSINIZ
        // Oluşturmaya çalışırsanız CTE verir
     }

     // public final String method5(){ return null; }
        // parent class'ta final olarak işaretlenen bir method
       // Child class'ta override edilemez

    private void method6(){
        // parent class'ta private olarak işaretlenmiş bir method
        // child classta aynı signature ile oluşturulabilir
        // bu oluşma override sağlamaz
    }

    protected void method7(){
        // her ne kadar signature esas olsa ve
        // access modifier siganture'a dahil olmasa da
        // overriding de modifier önemlidir.
        // child class'taki modifier
        //parent class'taki modifier'dan daha kısıtlayıcı olamaz
        // yani paretnt class'taki defult method
        // ancak default, protected veya public olarak
        // override edilebilir
        // Sınırlılık Sıralaması
        // private < default < protected < public

    }

    @Override
    public void method8() {

    }
    public int method9() {
        return 0;
    }



    String method10() {
        //eğer override edilen methodun return-type'ı
        //non-primitve ise
        // oevrriding methodun da return type'ı
        //ya aynısı olacak yada aralarında IS-A relationship ilişikisi
        // olan bir return type seçilmelidir
        // örnek String is a Object gibi

        // Primitive data türlerinde paret-child ilişkisi olmadığı için
        // Override eden ile edilenin return Type'ı aynı olmalıdır

        return null;
    }

    @Override
    public void method11() {
        super.method11();
        System.out.println("method11 child çalıştı");

        // overriding yapıldığında
        // body'si birbirinden farklı olan ki metod'dan
        // sadecebirisi çalışır
        // her ikisininde çalışmasını istiyorsam
        // super.methodIsmi(); kullanılır
        // bunu yazarak parettaki methodun da çalışmasını sağlayabiliriz
    }
}
