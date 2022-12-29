import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Kshirsagar");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Ks");
        Assert.assertFalse(result);
    }
}