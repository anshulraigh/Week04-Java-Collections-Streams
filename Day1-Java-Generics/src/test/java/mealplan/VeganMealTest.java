package mealplan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeganMealTest {

    @Test
    void testVeganMealType() {
        VeganMeal meal = new VeganMeal();
        assertEquals("Vegan Meal", meal.getMealType());
    }
}
