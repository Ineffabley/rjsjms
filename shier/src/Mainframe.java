
public class Mainframe {
	private HardDisk h;
	private CPU c;
	private Memory m;
	private OS o;
	public Mainframe(){
		h=new HardDisk();
		c=new CPU();
		m=new Memory();
		o=new OS();
	}
	public void on(){
		if(h.read()&&c.run()&&m.check()&&o.load()){
			System.out.println("计算机启动成功了");
			return ;
		}
		System.out.println("计算机启动失败了");
	}
}