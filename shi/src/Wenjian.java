public class Wenjian extends Zuhe{
	private String content;
	private static int fileCount=0;
	private int fileNumber=0;
	public Wenjian(String a){
		content=a;
		fileNumber=++fileCount;
	}
	public void operation() {
		System.out.println(fileNumber+"这个文件的内容是"+content);
	}
	public void add(Zuhe a) {
		throw new RuntimeException("文件之下不能再添加文件");
	}
	public void remove(Zuhe a) {
		throw new RuntimeException("文件之下没有子元素");
	}
	public Zuhe getChild(int a) {
		throw new RuntimeException("文件之下没有子元素");
		//return null;
	}
}
