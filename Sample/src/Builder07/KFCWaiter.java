package Builder07;

/**
 * @author ywq
 * @date 2020/11/21 19:46
 */

/*指挥者类*/
public class KFCWaiter {
    private MealBuilder builder;

    public void setBuilder(MealBuilder builder) {
        this.builder = builder;
    }

    public Meal construct()
    {
        builder.buildFood();
        builder.buildDrink();
        return  builder.getMeal();
    }
}
