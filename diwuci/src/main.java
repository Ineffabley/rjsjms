
public class main {
	public static void main(String args[])
	{
		ComBuilder cb=new Bijiben();
		Director dir=new Director();
		dir.setCB(cb);
		Computer com=dir.construct();
		System.out.println("计算机组成");
		System.out.println(com.getCPU());
		System.out.println(com.getnei());
		System.out.println(com.getying());
		System.out.println(com.getzhu());
	}
}