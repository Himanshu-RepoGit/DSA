import sun.misc.Unsafe;
public class Test {
	/*
	 * public static void main(String[] args) { double a = 0.1; double b = 0.2;
	 * double c = a + b; System.out.println(c); }
	 */
	
	 public static void main(String[] args) {
		    Unsafe unsafe = Unsafe.getUnsafe();
		    long value = unsafe.allocateMemory(1024);
		    System.out.println(value);
		  }

}
