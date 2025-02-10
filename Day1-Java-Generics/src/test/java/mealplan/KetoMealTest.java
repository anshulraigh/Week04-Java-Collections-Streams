package mealplan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KetoMealTest {

    @Test
    void testKetoMealType() {
        KetoMeal meal = new KetoMeal();
        assertEquals("Keto Meal", meal.getMealType());
    }
}
