/**
 * @author ywq
 * @date 2020/11/19 11:16
 */
public class main {
        public static void main(String[] args){
            Mingling m;
            Add a=new Add();
            Jisuan j=new Jisuan();
            a.show();
            System.out.println("开始操作");
            System.out.println("第一次操作");
            m=new Create(3,a);
            j.setM(m);
            j.execute();
            a.show();
            System.out.println("第二次操作");
            m=new Create(7,a);
            j.setM(m);
            j.execute();
            a.show();
            System.out.println("redo操作");
            j.redo();
            a.show();
            System.out.println("undo操作");
            j.undo();
            a.show();
            System.out.println("第三次操作");
            m=new Create(5,a);
            j.setM(m);
            j.execute();
            a.show();
        }
}
