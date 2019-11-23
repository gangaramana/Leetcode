package problem_1115;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;

//public class PrintFooBar {
//}


class FooBar {
    private int n;
//    AtomicInteger atomicInteger;
    SynchronousQueue synchronousQueue;

    public FooBar(int n) {
        this.n = n;
//        atomicInteger = new AtomicInteger(0);
        synchronousQueue = new SynchronousQueue();
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
//            while (atomicInteger.get() != 0) {
//                wait();
//            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
//            atomicInteger.set(1);
            synchronousQueue.put(1);
            notifyAll();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
//            while (atomicInteger.get() != 1) {
//                wait();
//            }
            synchronousQueue.take();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
//            atomicInteger.set(0);
//            notifyAll();
        }
    }
}
