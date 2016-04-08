package net.thisisdave.ch1;

/**
 * from java.boot.by
 *
 * Class defined in scope of another ("outer") class.
 * May be named or anonymous
 * Outer and inner class can directly access each other's fields and methods (even if private.)
 * Inside methods of outer class, use inner class as any other class Inner i = new Inner();
 * Inner class instance has association to an instance of outer class.
 * Inner class instance must be instantiated with an enclosing instance.
 * Inner class instance is tied to outer class object at moment of creation (can not be changed.)
 */
public class MemberInnerExample {

    public static void main(String[] args) {
        Outer2.Inner inner = new Outer2().new Inner();
        inner.seeOuter();
    }

}

class Outer2 {
    private int secretVar = 1337;

    class Inner{

        public void seeOuter(){
            System.out.println(String.format("Secret variable: %-25d",secretVar));
            System.out.println(String.format("Inner class ref: %-25s",this));
            System.out.println(String.format("Outer class ref: %-25s",Outer2.this));
        }

    }

}
