import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExValidate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// name validation:
		System.out.print("Please enter a valid name: ");
		String name = scan.nextLine();
		System.out.println(checkName(name));
		System.out.println();
		
		// email validation
		System.out.print("Please enter a valid email address: ");
		String email = scan.nextLine();
		System.out.println(checkEmail(email));
		System.out.println();
		
		// phone number validation
		System.out.print("Please enter a valid phone number: ");
		String phone = scan.nextLine();
		System.out.println(checkPhone(phone));
		System.out.println();
		
		// date validation
		System.out.print("Please enter a valid date: ");
		String date = scan.nextLine();
		System.out.println(checkDate(date));
		System.out.println();
		
		scan.close();
	}
	
	public static String checkName (String input) {
		String invalid = "Sorry, name is not valid!";
		String valid = "Name is valid!";
		if (Pattern.matches("([A-Z])\\w{1,30}", input)) {
		return valid;
		} else {
			return invalid;
		}
	}

	public static String checkEmail (String input) {
		String invalid = "Sorry, email address is not valid!";
		String valid = "Email address is valid!";
		if (Pattern.matches("^([A-Za-z0-9]{5,30})@([A-Za-z0-9]{5,10})\\.([A-Za-z0-9]{2,3})$", input)) {
		return valid;
		} else {
			return invalid;
		}
	}
	
	public static String checkPhone (String input) {
		String invalid = "Sorry, phone number is not valid!";
		String valid = "Phone number is valid!";
		if (Pattern.matches("^([0-9]{3})(\\-)([0-9]{3})(\\-)([0-9]{4})$", input)) {
		return valid;
		} else {
			return invalid;
		}
	}
	
	public static String checkDate (String input) {
		String invalid = "Sorry, date is not valid!";
		String valid = "Date is valid!";
		if (Pattern.matches("^(0[1-9]|1[012])[- \\/.](0[1-9]|[12][0-9]|3[01])[- \\/.]((?:19|20)\\d\\d)$", input)) {
		return valid;
		} else {
			return invalid;
		}
	}
}
