
public class SimplePhone implements Phone{
	public SimplePhone(){
		System.out.println("手机收到来电");
	}
	public void call(){
		System.out.println("发出声音");
	}
}