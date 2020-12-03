public class main {

	public static void main(String[] args) {
		try
		{
			Person p;
			String can="R";
			p=Nvwa.produce(can);
			p.show();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}