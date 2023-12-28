import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object key = new Object();
        Queue<Integer> queue = new LinkedList<>();
        int size =2;
        int maxIterations = 4; 

        Thread producer = new Thread(() -> {
            int count = 0;
            int iterations = 0;
            while (iterations < maxIterations) {
                synchronized (key) {
                    try {
                        while (queue.size() == size) key.wait();
                        queue.offer(count++);
                        key.notifyAll();
                        Thread.sleep(1000);
                        System.out.println("producer: " + queue.size());
                        iterations++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread consumer = new Thread(() -> {
            int iterations = 0;
            while (iterations < maxIterations) {
                synchronized (key) {
                    try {
                        while (queue.size() == 0) key.wait();
                        queue.poll();
                        key.notifyAll();
                        Thread.sleep(1000);
                        System.out.println("consumer: " + queue.size());
                        iterations++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
