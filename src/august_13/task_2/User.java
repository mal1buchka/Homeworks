package august_13.task_2;

import java.util.Scanner;

public class User {
    private String login;
    private String password;


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.next();
        try{
            if(password.matches("^.{8,20}$")){
                System.out.println("Success");
                this.password = password;
                sc.close();
            } else{
                throw new BadPasswordException("Fail \n Invalid password \n The length is " + password.length() + " It has to be min 8 characters\n Try again");
            }
        }catch (BadPasswordException e){
            e.printStackTrace();
            setPassword();
        }

    }
}
