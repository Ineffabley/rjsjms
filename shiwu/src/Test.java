/**
 * @author ywq
 * @date 2020/11/5 16:31
 */
public class Test {
    public static void main(String[] args) {
        Leader zhuren,bumen,fuzong,zong;
        Caigou danzi=new Caigou();
        zong=new Zong("总经理");
        fuzong=new Fuzong("副总经理",zong);
        bumen=new Bumen("部门经理",fuzong);
        zhuren=new Zhuren("主任",bumen);
        danzi.setMoney(2500);
        zhuren.Cai(danzi);
        System.out.println("--------");
        danzi.setMoney(50300);
        zhuren.Cai(danzi);
        System.out.println("--------");
        danzi.setMoney(1009000);
        zhuren.Cai(danzi);

    }
}
