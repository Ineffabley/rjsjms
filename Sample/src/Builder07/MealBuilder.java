package Builder07;

/**
 * @author ywq
 * @date 2020/11/21 19:18
 */
/*抽象建造者类*/
public abstract class MealBuilder {
    protected Meal meal=new Meal();
    public  abstract void buildFood();
    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
