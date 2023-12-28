
import java.util.*;
public class Main{
    public static void main(String[] args){
        Object key=new Object();
        Queue<Integer>queue=new LinkedList<Integer>();
        int size=8;
        Thread producer=new Thread(new Runnable(){
            @Override
            public void run(){
                int count=0;
               while(true){ 
                   synchronized(key){
                    
                    try{
                        while(queue.size()==size)
                        key.wait();
                        
                       queue.offer(count++);
                       key.notifyAll();
                       
                       Thread.sleep(1000);
                        System.out.println("producer: "+queue.size());
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
               }
            }
        });
         Thread consumer=new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                  synchronized(key){
                   
                    try{
                         while(queue.size()==0)
                        key.wait();
                        
                        queue.poll();
                        key.notifyAll();
                        
                        Thread.sleep(1000);
                        System.out.println("consumer: "+queue.size());
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }    
              }
            }
        });
        producer.start();
        consumer.start();
    }
}
