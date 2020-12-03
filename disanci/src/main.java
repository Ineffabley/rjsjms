public class main {

	public static void main(String[] args) {
		try{
			Mi mi;
			MiFactory mif;
			mif=new IDEAFactory();
			mi=mif.produceMi();
			mi.show();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}