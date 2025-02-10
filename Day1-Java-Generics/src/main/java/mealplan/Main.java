package mealplan;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        vegetarianMeal.generateMealPlan();

        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        veganMeal.generateMealPlan();

        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        ketoMeal.generateMealPlan();
    }
}
