
public class White implements Qi{
	private static White w=null;
	private String wei;
	public White(){}
	public static White getw(String a){
		if(w==null)
			w=new White();
		w.setwei(a);
		return w;
	}
	public void setwei(String a){
		wei=a;
	}
	public void show(){
		System.out.println(getType()+"的位置在"+getWei());
	}
	public String getType() {
		return "白棋";
	}
	public String getWei() {
		return wei;
	}
}