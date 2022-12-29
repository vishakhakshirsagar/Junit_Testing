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

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmailAddress("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_IsValid_ShouldReturnTrue() {
        boolean result = userRegistration.validateMobileNumber("+91 9146965226");
//        Assert.assertFalse(result);
        Assert.assertTrue(result);
    }
}