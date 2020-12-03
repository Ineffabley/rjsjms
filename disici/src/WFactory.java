public class WFactory implements PFactory{
	public Man produceMan()
	{
		return new WMan();
	}
	public Woman produceWoman()
	{
		return new WWoman();
	}
}
