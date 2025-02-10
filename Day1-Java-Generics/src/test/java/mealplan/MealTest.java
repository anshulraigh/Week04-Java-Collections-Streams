package mealplan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testGenerateMealPlan() {
        Meal<VegetarianMeal> meal = new Meal<>(new VegetarianMeal());
        assertDoesNotThrow(meal::generateMealPlan);
    }
}
