package customexception;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
