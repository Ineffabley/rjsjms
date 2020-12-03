
public class JarPhone extends GaoPhone{
	public JarPhone(Phone a){
		super(a);
		System.out.println("增加震动的功能");
	}
	public void zhen(){
		System.out.println("震动");
	}
}