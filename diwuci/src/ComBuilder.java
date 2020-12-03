public abstract class ComBuilder {
	protected Computer com=new Computer();
	public abstract void buildCPU();
	public abstract void buildnei();
	public abstract void buildying();
	public abstract void buildzhu();
	public Computer getCom()
	{
		return com; 
	}
}