package net.thisisdave.ch1;

/**
 * Local inner classes are classes that are defined in a block, which is a group of zero or more statements between balanced curly braces. You typically find local classes defined in the body of a method
 */
public class MethodLocalInnerExample {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.doStuff();
        System.out.println();
        Outer4.doStuff();
    }
}

//Instance method local inner class:
class Outer3 {
    private String x = "outer";

    public void doStuff(){

//        Method local inner class, because its in a method <-- Instance as it needs to be instantiated to be used (non-static)
        class MyInner {
            public void seeOuter() {
                System.out.println(String.format("Value of x: %s",x));

            }
        }

        MyInner i = new MyInner();
        i.seeOuter();

    }
}

//Static method local inner class:
class Outer4 {
    private static String x = "static outer";

    public static void doStuff(){
        class MyInner {
            public void seeOuter(){
                System.out.println(String.format("Value of x: %s",x));
            }
        }
        MyInner i = new MyInner();
        i.seeOuter();
    }
}