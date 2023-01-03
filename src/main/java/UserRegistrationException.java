public class UserRegistrationException extends Exception {
    public UserRegistrationException(ExceptionType enteredNull, String entry_should_be_not_null_) {
    }

    public double ValidateEmailAddress(String emailId) {
        return 0;
    }

    enum ExceptionType {
        ENTERED_NULL, ENTERED_INVALID
    }

    ExceptionType type;

    public UserRegistrationException(String message) {
        super(message);
        this.type = type;
    }
}
