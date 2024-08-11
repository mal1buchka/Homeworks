package august_13.task_2;

public class BadPasswordException extends RuntimeException{
    public BadPasswordException(String message){
        super(message);
    }
}
