import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
 public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
 public static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
 public static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z]{3,}[.+-][a-zA-Z0-9]*" +
         "[@][a-zA-Z]+[.][a-z]{3,}([_+-.][a-zA-Z])*$";
 public static final String MOBILE_NUMBER_PATTERN = "^[+91|0]+[ ]?[6-9]{1}[0-9]{9}";

 public static final String PASSWORD_PATTERN = "^[a-zA-Z0-9]{8,}$";

 public static final String AT_LEAST_ONE_UPPER_CASE_PASSWORD_PATTERN = "^((?=.*[A-Z]))[a-zA-Z0-9]{8,}$";

 public static final String AT_LEAST_ONE_NUMERIC_NUMBER_PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])" +
         "[a-zA-Z0-9]{8,}$";
 public static final String AT_LEAST_ONE_SPECIAL_CHARACTER_PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!%])" +
         "[a-zA-Z0-9$@!%]{8,}$";
 public boolean validateFirstName(String firstName) {
  return patternChecker(firstName, FIRST_NAME_PATTERN);
 }

 public boolean validateLastName(String firstName) {
  return patternChecker(firstName, LAST_NAME_PATTERN);
 }

 public boolean validateEmailAddress(String email) {
  return patternChecker(email, EMAIL_ADDRESS_PATTERN);
 }

 public boolean validateMobileNumber(String mobileNo) {
  return patternChecker(mobileNo, MOBILE_NUMBER_PATTERN);
 }

 public boolean validatePassword(String password) {
  return patternChecker(password, PASSWORD_PATTERN);
 }
 public boolean validatePasswordAtLeastOneUpperCase(String password) {
  return patternChecker(password, AT_LEAST_ONE_UPPER_CASE_PASSWORD_PATTERN);
 }
 public boolean validatePasswordAtLeastOneNumericNumber(String password) {
  return patternChecker(password, AT_LEAST_ONE_NUMERIC_NUMBER_PASSWORD_PATTERN);
 }

 public boolean validatePasswordAtLeastOneSpecialCharacter(String password) {
  return patternChecker(password, AT_LEAST_ONE_SPECIAL_CHARACTER_PASSWORD_PATTERN);
 }

  public boolean patternChecker (String input, String fieldPattern){
   Pattern pattern = Pattern.compile(fieldPattern);
   Matcher matcher = pattern.matcher(input);
   return matcher.matches();
  }
 }