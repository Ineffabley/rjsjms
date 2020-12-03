public class Nvwa {
	public static Person produce(String a) throws Exception
	{
		if(a.equalsIgnoreCase("M"))
		{
			System.out.println("女娲造了一个Man");
			return new Man();
		}
		else if(a.equalsIgnoreCase("W"))
		{
			System.out.println("女娲造了一个Woman");
			return new Woman();
		}
		else if(a.equalsIgnoreCase("R"))
		{
			System.out.println("女娲造了一个Robot");
			return new Robot();
		}
		else
		{
			throw new Exception("参数有误");
		}
	}
}