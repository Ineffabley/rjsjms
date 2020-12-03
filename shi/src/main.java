
public class main {
	public static void main(String[] args) {
		Zuhe zuhe=new Wenjianjia();
		zuhe.add(new Wenjianjia());
		zuhe.add(new Wenjianjia());
		zuhe.add(new Wenjianjia());

		zuhe.add(new Wenjian("第一层文件夹下的一个文件"));
		zuhe.add(new Wenjian("第一层文件夹下的一个文件"));
		zuhe.getChild(0).add(new Wenjian("第二层中第一个文件夹下的一个文件"));
		zuhe.getChild(0).add(new Wenjian("第二层中第一个文件夹下的一个文件"));
		zuhe.getChild(1).add(new Wenjian("第二层中第二个文件夹下的一个文件"));
		zuhe.getChild(2).add(new Wenjian("第二层中第三个文件夹下的一个文件"));
		zuhe.getChild(0).add(new Wenjianjia());
		zuhe.getChild(0).getChild(2).add(new Wenjian("出于第四层的一个文件"));
		zuhe.operation();
	}
}