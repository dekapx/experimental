package net.kapil.urlgenerator.service;

public class InvalidURLException extends RuntimeException {
    public InvalidURLException(final String message) {
        super(message);
    }

    public InvalidURLException(final String message, final Exception cause) {
        super(message, cause);
    }
}
