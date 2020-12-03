public class YFactory implements PFactory{
	public Man produceMan()
	{
		return new YMan();
	}
	public Woman produceWoman()
	{
		return new YWoman();
	}
}