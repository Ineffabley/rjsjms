/**
 * @author ywq
 * @date 2020/11/26 14:45
 */
public class main {
    public static void main(String[] args) {
        Fen f=new Fen();
        Gumin g1=new Gumin("第一个股民");
        Gumin g2=new Gumin("第二个股民");
        f.add(g1);
        f.add(g2);
        System.out.println("股票升了");
        f.sheng(0.1);
        System.out.println("比率小于0.05");
        System.out.println();
        f.sheng(0.001);

        System.out.println("股票降了");
        f.jiang(0.1);
        System.out.println("比率小于0.05");
        System.out.println();
        f.jiang(0.001);
    }
}