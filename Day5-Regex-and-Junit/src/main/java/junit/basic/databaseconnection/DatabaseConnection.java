package junit.basic.databaseconnection;

public class DatabaseConnection {
    private boolean connected;

    /**
     * Simulates establishing a connection to the database.
     */
    public void connect() {
        connected = true;
        System.out.println("Connected to the database.");
    }

    /**
     * Simulates disconnecting from the database.
     */
    public void disconnect() {
        connected = false;
        System.out.println("Disconnected from the database.");
    }

    /**
     * Checks if the database connection is active.
     * @return true if connected, false otherwise.
     */
    public boolean isConnected() {
        return connected;
    }
}
