import static java.lang.System.*;
interface Interface3 {
    default void hello() { System.out.println("Hello World from A"); }
}

 interface Interface1 extends Interface3
{
@Override
default void hello() {System.out.println("Hello world from B");
}
}
interface Interface2 extends Interface3
{
@Override
default void hello() {
System.out.println("Hello world from C");
}

}


public class zadanieGG implements Interface1,Interface2,Interface3 {

    public void hello() {
        Interface2.super.hello();
    }
    public static void main(String[] args) {
        zadanieGG a = new zadanieGG();
        a.hello();
    }

}