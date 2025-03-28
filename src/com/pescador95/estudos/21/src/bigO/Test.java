package src.bigO;


public class Test {

    public static void main(String... args) {

        var o1 = new String("a");
        var o2 = new String("a");

        var o3 = "a";
        var o4 = "a";

        var o5 = new String("a");
        var o6 = o5;

        System.out.println(o1.equals(o2)); //true
        System.out.println(o1 == o2); //false
        System.out.println(o3 == o4); //true
        System.out.println(o1.hashCode());

        System.out.println(o5.equals(o6)); // true

        System.out.println(o5 == o6); // true
    }

}

class ThreadTest {

    public static void main(String... args) {

        Increment increment = new Increment();

        ThreadExecutor threadExecutor = new ThreadExecutor(increment);

        Thread t1 = new Thread(threadExecutor);
        Thread t2 = new Thread(threadExecutor);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(increment.count);
    }
}

class ThreadExecutor implements Runnable {

    Increment increment;

    public ThreadExecutor(Increment increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increment.increment();
        }
    }
}


class Increment {

    volatile long count;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }
}