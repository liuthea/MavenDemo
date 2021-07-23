import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private int capacity=5;

    ArrayDeque<Integer> list=new ArrayDeque<>();

    public void pop() throws InterruptedException{

        while(true) {
            synchronized (this) {
                while(list.size()==0) wait();
                int val=list.removeLast();
                System.out.println("Consumer consumed-"
                        + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

    public void push() throws InterruptedException{
    int val=0;
    while(true) {
        synchronized (this) {
            while(list.size()>=capacity) wait();
            System.out.println("Producer produced-"
                    + val);
            list.addFirst(val++);
            notify();
            Thread.sleep(1000);
        }
    }
    }

}

