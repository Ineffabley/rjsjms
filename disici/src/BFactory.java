public class BFactory implements PFactory{
	public Man produceMan()
	{
		return new BMan();
	}
	public Woman produceWoman()
	{
		return new BWoman();
	}
}