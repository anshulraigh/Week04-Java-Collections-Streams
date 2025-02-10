package resumescreening;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobRoleTest {

    @Test
    void testSoftwareEngineerRole() {
        JobRole engineer = new SoftwareEngineer();
        assertEquals("Software Engineer", engineer.getRoleName());
    }

    @Test
    void testDataScientistRole() {
        JobRole scientist = new DataScientist();
        assertEquals("Data Scientist", scientist.getRoleName());
    }

    @Test
    void testProductManagerRole() {
        JobRole manager = new ProductManager();
        assertEquals("Product Manager", manager.getRoleName());
    }
}
