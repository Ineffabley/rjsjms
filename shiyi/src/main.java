public class main {
	public static void main(String[] args) {
		Phone a=new SimplePhone();
		a.call();
		JarPhone j=new JarPhone(a);
		j.zhen();
		ComplexPhone c=new ComplexPhone(a);
		c.shan();
		
	}
}