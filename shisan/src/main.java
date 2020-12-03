
public class main {
	public static void main(String[] args) {
		Qi a,b;
		Factory f=new Factory();
		a=f.getq("白棋");
		a=White.getw("(3,2)");
		a.show();
		b=f.getq("黑棋");
		b=Black.getw("(4,6)");
		b.show();
		a=White.getw("(4,6)");
		a.show();
		b=Black.getw("(6,5)");
		b.show();
		a=White.getw("(9,5)");
		a.show();
		b=Black.getw("(5,3)");
		b.show();
	}
}