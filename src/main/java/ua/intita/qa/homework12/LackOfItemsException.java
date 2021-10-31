package ua.intita.qa.homework12;

public class LackOfItemsException extends Exception{
    public LackOfItemsException() {
    }

    public LackOfItemsException(String message) {
        super(message);
    }

    public LackOfItemsException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfItemsException(Throwable cause) {
        super(cause);
    }

    public LackOfItemsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
