package GenaralJava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread  extends Thread {
	@Override
	public void run() {
		  System.out.println("Thread is running:");	
	}
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code that will run in the new thread
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

class MyCallble implements Callable<String>{
	@Override
	public String call() {
		  return "Thread result: " + Thread.currentThread().getName();	
	}
}

public class CreatingThread{
	public static void main(String[] args) {
		Thread t1=new MyThread();
		t1.start();
		Thread t2=new Thread(new MyRunnable());
		t2.start();
		MyCallble cal=new MyCallble();
		ExecutorService es=Executors.newFixedThreadPool(10);
		es.submit(cal);
	}
}