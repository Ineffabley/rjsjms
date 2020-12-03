
public class main {

	public static void main(String[] args) {
		Xuehao x,y;
		x=Xuehao.getIns();
		y=Xuehao.getIns();
		System.out.println("学号是否一致"+(x==y));

		String a,b;
		a=x.getXuehao();
		b=y.getXuehao();
		System.out.println("第一次学号是"+a);
		System.out.println("第二次学号是"+b);
		System.out.println("内容是否相等"+a.equals(b));
		System.out.println("是否是相同对象"+(a==b));
	}

}