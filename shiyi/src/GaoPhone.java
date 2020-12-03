public class GaoPhone implements Phone{
	private Phone phone;
	public GaoPhone(Phone a){
		phone=a;
	}
	public void call(){
		phone.call();
	}
}