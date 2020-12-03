public class DESFactory implements MiFactory{
	public Mi produceMi()
	{
		return new DES();
	}
}