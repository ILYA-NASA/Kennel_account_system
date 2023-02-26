package Exceptions;

public class UncorrectDataException extends RuntimeException{
    
    public UncorrectDataException (String msg) {
        super(msg);
    }
}