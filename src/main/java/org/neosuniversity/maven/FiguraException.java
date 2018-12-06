package org.neosuniversity.maven;

public class FiguraException extends Exception {

    public FiguraException(String message) {
        super(message);
    }

    public FiguraException(String message, Throwable cause) {
        super(message, cause);
    }
}