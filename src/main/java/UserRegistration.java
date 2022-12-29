import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
 public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
public static final String  LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
 public boolean validateFirstName(String firstName) {
  return patternChecker(firstName, FIRST_NAME_PATTERN);
 }
 public boolean validateLastName(String firstName) {
  return patternChecker(firstName, LAST_NAME_PATTERN);
 }
  public boolean patternChecker (String input, String fieldPattern){
   Pattern pattern = Pattern.compile(fieldPattern);
   Matcher matcher = pattern.matcher(input);
   return matcher.matches();
  }
 }