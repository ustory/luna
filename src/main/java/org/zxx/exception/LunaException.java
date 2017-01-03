package org.zxx.exception;

public class LunaException extends RuntimeException {
    private String code;

    LunaException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
