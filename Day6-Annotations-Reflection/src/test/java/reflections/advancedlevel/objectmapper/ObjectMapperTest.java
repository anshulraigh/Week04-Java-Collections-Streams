package reflections.advancedlevel.objectmapper;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ObjectMapperTest {

    @Test
    void testToObject() {

        Map<String, Object> personData = new HashMap<>();
        personData.put("name", "Anshul");
        personData.put("age", 25);
        personData.put("city", "Bhopal");


        Person person = ObjectMapper.toObject(Person.class, personData);


        assertEquals("Anshul", person.getName());
        assertEquals(25, person.getAge());
        assertEquals("Bhopal", person.getCity());
    }
}
