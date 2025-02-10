package mealplan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VegetarianMealTest {

    @Test
    void testVegetarianMealType() {
        VegetarianMeal meal = new VegetarianMeal();
        assertEquals("Vegetarian Meal", meal.getMealType());
    }
}
