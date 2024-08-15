package august_15.task_1;

public class Main {
    public static void main(String[] args) {
        String test = "(123) 456-789-120";
        String test2 = "123-45-7890";
        System.out.println(isItPhoneNumber(test)); // true
        System.out.println(isItPhoneNumber(test2)); // false
    }
    public static boolean isItPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\(\\d{3}\\) \\d{3}-\\d{3}-\\d{3}$");
    }
}
