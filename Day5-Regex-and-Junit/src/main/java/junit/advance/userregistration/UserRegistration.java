package junit.advance.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // Basic email validation pattern.
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$");

    /**
     * Registers a user with the provided username, email, and password.
     * Validates inputs and throws IllegalArgumentException if any input is invalid.
     *
     * @param username the user's username (must not be empty)
     * @param email the user's email (must match a basic email pattern)
     * @param password the user's password (must be at least 8 characters)
     * @return a success message if registration is valid
     * @throws IllegalArgumentException if any input is invalid
     */
    public static String registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        // For simplicity, assume registration is successful.
        return "User registered successfully.";
    }
}
