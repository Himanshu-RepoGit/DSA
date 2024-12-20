package Multithreading;

public class OddEven {
boolean printOdd;
int count=1;
int max=20;

public void PrintOdd() {
	synchronized (this) {
		while(count<max) {
			while(!printOdd) {
				try {
					wait();
				}
				catch(Exception e) {
				}
			}
				System.out.println(count);
				count++;
				printOdd=false;
				notify();
			}
		
	}
}
public void PrintEvent() {
	synchronized (this) {
		while(count<max) {
			while(printOdd) {
				try {
					wait();
				}
				catch(Exception e) {
				}
			}
				System.out.println(count);
				count++;
				printOdd=true;
				notify();
			
		}
	}
}

public static void main(String[] args) {
	OddEven oe=new OddEven();
	oe.printOdd=true;
	Runnable r1=()->oe.PrintEvent();
	Runnable r2=()->oe.PrintOdd();
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
}
}
