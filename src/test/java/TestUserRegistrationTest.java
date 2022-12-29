import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Jui");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Ju");
        Assert.assertFalse(result);
    }
}