package day29_abstractClasses;

public class C04_ChildOfKuralciParent extends C03_KuralciParent{

    public void method1() {
        System.out.println("C04 method1");
    }


    public void method2() {
        System.out.println("C04 method2");
    }

    @Override
    public int method5() {
        System.out.println("C04 method5");
        return 0;
    }
    //  Class 'C04_ChildOfKuralciParent' must either be declared abstract
    //  or implement abstract method 'method1()' in 'C03_KuralciParent'
    // C04 ya abstract olarak deklare edilmeli
    //     ya da parent class sectigi C03'deki abstract method'lari
    //     kendisine implement etmelidir



}
