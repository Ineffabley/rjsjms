package Builder07;

/**
 * @author ywq
 * @date 2020/11/21 19:45
 */
public class SubMealBuilderB extends MealBuilder{

    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("奶茶");

    }
}
