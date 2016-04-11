package net.thisisdave.ch1;

/**
 * Created by David on 11-4-2016.
 */
public class Shadow {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x); //references method x
            System.out.println("this.x = " + this.x); //references inner class x
            System.out.println("Shadow.this.x = " + Shadow.this.x); //references outer class x
        }
    }

    public static void main(String... args) {
        Shadow s = new Shadow();
        Shadow.FirstLevel fl = s.new FirstLevel();
        fl.methodInFirstLevel(2);
    }
}
