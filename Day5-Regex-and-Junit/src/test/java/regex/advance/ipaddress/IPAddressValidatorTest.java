package regex.advance.ipaddress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IPAddressValidatorTest {

    @Test
    public void testValidIPAddresses() {
        assertTrue(IPAddressValidator.isValidIPAddress("192.168.1.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPAddressValidator.isValidIPAddress("0.0.0.0"));
        assertTrue(IPAddressValidator.isValidIPAddress("172.16.254.1"));
    }

    @Test
    public void testInvalidIPAddresses() {
        // Too few groups
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1"));
        // Too many groups
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.1.1"));
        // Values out of range
        assertFalse(IPAddressValidator.isValidIPAddress("256.100.50.25"));
        // Non-numeric characters
        assertFalse(IPAddressValidator.isValidIPAddress("192.abc.1.1"));
    }
}
