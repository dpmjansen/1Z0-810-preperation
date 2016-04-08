package net.thisisdave.ch1;

/**
 * From java.boot.by
 *
 * Similar to inner class, but declared as static class.
 * No link to an instance of the outer class.
 * Can only access static fields and methods of the outer class.
 * Useful if inner class object:
 *  Associated with different outer class objects.
 *  Survives longer than outer class object.
 */
public class StaticNestedExample {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
//        not allowed as Inner is static and cannot be instantiated
//        Outer.Inner inner = new Outer().new Inner();
        inner.dostuff();
    }
}

class Outer {

    //Cannot by Outer.Inner, as it is not an instance of the Outer class
    static String noWay = "noWay";

    static class Inner{
        void dostuff(){
            System.out.println(String.format("This is an example of a static nested class + %s",this.toString()));
        }
    }

}