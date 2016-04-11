package net.thisisdave.ch2;

/**
 * Created by David on 11-4-2016.
 */
@FunctionalInterface
public interface FuncInt4 {
    //default method which can be overwritten by classes implementing this itnerface
    default void doStuff(){
        System.out.println("Did stuff");
    }
    //Without this abstract method, the functional interface wouldt throw a compilateion error
    void doStuffNow();

    static void doStatisStuff(){
        System.out.println("I am ex-tat-ic");
    }
}
