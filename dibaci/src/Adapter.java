public class Adapter implements Cat,Dog{
	private Cat cat=new Realcat();
	private Dog dog=new Realdog();
	public void setcat(Cat a){
		cat=a;
	}
	public void setdog(Dog a){
		dog=a;
	}
	public void zhua(){}
	public void han(String a){}
	public void dong(){
		System.out.println("小狗学小猫");
		cat.zhua();
	}
	public void cry(String a){
		System.out.println("小猫学小狗");
		dog.han(a);
	}
}