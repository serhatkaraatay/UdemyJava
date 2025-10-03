import java.io.IOException;
import java.io.PrintStream;

//public class InvalidAgeException extends ArithmeticException{
//    public InvalidAgeException(String message){
//        super(message);
//    }
//    @Override
//    public void printStackTrace() {
//        System.out.println("Bu bir InvalidAgeException hatasıdır.");
//    }
public class InvalidAgeException extends IOException {
    public InvalidAgeException(String message){
        super(message);
    }
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir InvalidAgeException hatasıdır.");
    }
}
