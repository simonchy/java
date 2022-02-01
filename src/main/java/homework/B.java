package homework;

public class B {
    public static void main(String[] args) {
// Non static;
        System.out.println("nonstatic");

        A obj=new A();
        obj.sum();
        obj.sub();
        obj.mul();
        obj.Div();

        //static
        System.out.println("static");
        C.sum();
        C.sub();
        C.mul();
        C.Div();
       // peramitarized;
        System.out.println("peramitarized");



        D d=new D();
        d.sum( 20,30);
        d.sub(50,10);
        d.mul(20,5);
        d.Div(20,2);


    }
}
