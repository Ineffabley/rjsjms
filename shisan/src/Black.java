public class Black implements Qi{
	private static Black b=null;
	private String wei;
	public Black(){}
	public static Black getw(String a){
		if(b==null)
			b=new Black();
		b.setwei(a);
		return b;
	}
	public void setwei(String a){
		wei=a;
	}
	public void show(){
		System.out.println(getType()+"的位置在"+getWei());
	}
	public String getType() {
		return "黑棋";
	}
	public String getWei() {
		return wei;
	}
}