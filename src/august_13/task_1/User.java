package august_13.task_1;



public class User {


    public static boolean input(String login, String password, String confirmPassword){
            try{
                if(!login.matches("^[a-zA-Z0-9_]{1,19}$")){
                    throw new WrongLoginException();
                }
                if(!password.matches("^[a-zA-Z0-9_]{1,19}$")){
                    throw new WrongPasswordException();
                }
                if(!password.equals(confirmPassword)){
                    throw new  WrongPasswordException("Passwords do not match");
                }
                return true;
            }catch (WrongLoginException | WrongPasswordException e){
                e.printStackTrace();
                return false;
            }
    }

    public static void main(String[] args) {
        System.out.println(input("malik1242", "0108Njjn!", "0108Njjn!"));
        // не сработает из-за !
        System.out.println(input("malik1242", "0108Njjn", "0108Njjn"));
        System.out.println(input("1","2", "2"));
    }
}
