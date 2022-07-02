package model.exceptions;

public class CurrentAccountException extends RuntimeException {
    public CurrentAccountException(String msg) {
        super(msg);
    }
}
