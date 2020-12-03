import java.util.*;

public class Wenjianjia extends Zuhe{
	private static int folderCount=0;
	private int folderNumber=0;
	private List<Zuhe> zuhe;
	public Wenjianjia(){
		zuhe=new LinkedList<>();
		folderNumber=++folderCount;
	}
	public void operation() {
		System.out.println("浏览"+folderNumber+"这个文件夹之下的文件");
		for(Zuhe zuhes:zuhe){
			zuhes.operation();
		}
	}
	public void add(Zuhe a) {
		zuhe.add(a);
	}
	public void remove(Zuhe a) {
		zuhe.remove(a);
	}
	public Zuhe getChild(int a) {
		return zuhe.get(a);
	}
}