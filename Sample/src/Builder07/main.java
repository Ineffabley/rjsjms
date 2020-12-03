package Builder07;

/**
 * @author ywq
 * @date 2020/11/21 19:49
 */
public class main {
    public static void main(String[] args) {
        System.out.println("套餐A");
        //服务员是指挥者
        KFCWaiter w=new KFCWaiter();
        MealBuilder ma=new SubMealBuilderA();
        MealBuilder mb=new SubMealBuilderB();
        //服务员准备套餐A
        w.setBuilder(ma);
        //获得套餐A
        Meal meala=w.construct();
        System.out.println("套餐A准备完成:");
        System.out.println(meala.getDrink()+"=="+meala.getFood());
    }
}
