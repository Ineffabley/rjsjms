public class main {
	public static void main(String args[])
	{
		try
		{
			PFactory fac;
			Man m;
			Woman w;
			fac=new WFactory();

			//fac=new YFactory();
			m=fac.produceMan();
			m.show();
			w=fac.produceWoman();
			w.show();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}