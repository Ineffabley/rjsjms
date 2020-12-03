package Builder07;

/**
 * @author ywq
 * @date 2020/11/21 19:17
 */
public class SubMealBuilderA  extends MealBuilder{

    @Override
    public void buildFood() {
        meal.setFood("鸡腿堡");
    }

    @Override
    public void buildDrink() {
meal.setDrink("可乐");
    }
}
