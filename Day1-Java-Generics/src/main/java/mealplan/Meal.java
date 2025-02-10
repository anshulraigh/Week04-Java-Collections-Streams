package mealplan;

public class Meal<T extends MealPlan> {
    private final T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan() {
        System.out.println("Generating meal plan for: " + mealPlan.getMealType());
    }
}
