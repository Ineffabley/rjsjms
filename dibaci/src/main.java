
public class main {

	public static void main(String[] args) {
		Dog dog=new Realdog();
		//dog.dong();
		Cat cat=new Realcat();



		Adapter ad=new Adapter();
		ad.setcat(cat);
		ad.setdog(dog);
		ad.dong();
		System.out.println("");
		ad.cry("汪汪汪");
	}

}