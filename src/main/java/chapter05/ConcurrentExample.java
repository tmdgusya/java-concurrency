package chapter05;

import java.util.Vector;

public class ConcurrentExample {

    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i < 100_0; i++) {
            vector.add(i);
        }

        vector.forEach(integer -> doSomething(integer, vector));
    }

    private static void doSomething(Integer integer, Vector<Integer> vector){
        vector.remove(1);
        System.out.println(integer);
    }
}
