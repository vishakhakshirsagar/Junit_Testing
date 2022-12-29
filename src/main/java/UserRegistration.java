import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
 public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
public static final String  LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";

public static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z]{3,}[.+-][a-zA-Z0-9]*[@][a-zA-Z]+[.][a-z]{3,}([_+-.][a-zA-Z])*$";
 public boolean validateFirstName(String firstName) {
  return patternChecker(firstName, FIRST_NAME_PATTERN);
 }
 public boolean validateLastName(String firstName) {
  return patternChecker(firstName, LAST_NAME_PATTERN);
 }
 public boolean validateEmailAddress(String email) {
  return patternChecker(email, EMAIL_ADDRESS_PATTERN);
 }
  public boolean patternChecker (String input, String fieldPattern){
   Pattern pattern = Pattern.compile(fieldPattern);
   Matcher matcher = pattern.matcher(input);
   return matcher.matches();
  }
 }