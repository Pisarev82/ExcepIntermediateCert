package org.example;

public class AmountDataError extends Exception {

    public AmountDataError() {
        super();
    }

    public AmountDataError(String message) {
        super(message);
    }

    public AmountDataError(String message, Throwable cause) {
        super(message, cause);
    }
}
