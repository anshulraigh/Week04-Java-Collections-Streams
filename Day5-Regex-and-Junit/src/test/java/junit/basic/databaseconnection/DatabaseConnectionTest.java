package junit.basic.databaseconnection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    public void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testConnectionIsEstablished() {
        // Verify that the connection is established before each test.
        assertTrue(dbConnection.isConnected(), "Database should be connected in @BeforeEach.");
    }

    @Test
    public void testDisconnect() {
        // Manually disconnect and verify that the connection is closed.
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database should be disconnected after calling disconnect().");
    }
}
