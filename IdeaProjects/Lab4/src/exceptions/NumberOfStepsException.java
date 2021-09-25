package exceptions;

public class NumberOfStepsException extends Exception{
    private int value;

    public NumberOfStepsException(String message, int n){
        super(message);
        this.value=n;
    }

    public int getValue(){
        return value;
    }
}
