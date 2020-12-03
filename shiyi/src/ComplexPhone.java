public class ComplexPhone extends GaoPhone{
	public ComplexPhone(Phone a){
		super(a);
		System.out.println("增加闪光功能");
	}
	public void shan(){
		System.out.println("闪光");
	}
}