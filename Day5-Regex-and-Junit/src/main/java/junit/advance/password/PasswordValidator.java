package junit.advance.password;

import java.util.regex.Pattern;

public class PasswordValidator {

    // Regex to ensure the password:
    // - Has at least 8 characters
    // - Contains at least one uppercase letter
    // - Contains at least one digit
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");

    /**
     * Validates the given password.
     * @param password the password to validate
     * @return true if the password meets the requirements, false otherwise
     */
    public static boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}
