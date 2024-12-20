package GenaralJava;

public class Singleton {

}
class EagerInit{
	private static final EagerInit ea=new EagerInit();	
	private EagerInit() {}
	public static EagerInit getInstance() {
		return ea;
	}
}
enum EnumSingleton{
	INSTANCE;
	}