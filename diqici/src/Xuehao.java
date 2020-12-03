
public class Xuehao {
	private static Xuehao ins=null;
	private String hao;
	private Xuehao(){}
	public static Xuehao getIns(){
		if(ins==null){
			System.out.println("第一次注册，生成学号");
			ins=new Xuehao();
			ins.setXuehao("20183725");
		}else{
			System.out.println("第二次注册，获取旧的学号");
		}
		return ins;
	}
	private void setXuehao(String a){
		hao=a;
	}
	public String getXuehao(){
		return hao;
	}
}