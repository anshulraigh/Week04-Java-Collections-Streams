package mealplan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MealPlanTest {

    @Test
    void testMealPlanInterfaceImplementation() {
        MealPlan mealPlan = new VegetarianMeal();
        assertNotNull(mealPlan.getMealType());
    }
}
