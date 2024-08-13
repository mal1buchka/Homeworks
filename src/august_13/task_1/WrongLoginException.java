package august_13.task_1;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super("Invalid password");
    }
    public WrongLoginException(String message){
        super(message);
    }
}
