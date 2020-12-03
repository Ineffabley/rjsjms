public class Director {
	private ComBuilder cb;
	public void setCB(ComBuilder a)
	{
		cb=a;
	}
	public Computer construct()
	{
		cb.buildCPU();
		cb.buildnei();
		cb.buildying();
		cb.buildzhu();
		return cb.getCom();
	}
}