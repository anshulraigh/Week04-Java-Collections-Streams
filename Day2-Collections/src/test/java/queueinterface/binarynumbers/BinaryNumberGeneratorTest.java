package queueinterface.binarynumbers;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberGeneratorTest {

    @Test
    void testGenerateBinaryNumbers() {
        BinaryNumberGenerator generator = new BinaryNumberGenerator();
        List<String> expected = Arrays.asList("1", "10", "11", "100", "101");

        assertEquals(expected, generator.generateBinaryNumbers(5));
    }

    @Test
    void testGenerateBinaryNumbersForOne() {
        BinaryNumberGenerator generator = new BinaryNumberGenerator();
        List<String> expected = List.of("1");

        assertEquals(expected, generator.generateBinaryNumbers(1));
    }

    @Test
    void testGenerateBinaryNumbersForZero() {
        BinaryNumberGenerator generator = new BinaryNumberGenerator();
        List<String> expected = List.of();

        assertEquals(expected, generator.generateBinaryNumbers(0));
    }
}
