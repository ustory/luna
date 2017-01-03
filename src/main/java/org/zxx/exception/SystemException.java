package org.zxx.exception;

public class SystemException extends LunaException {
    public SystemException(String message) {
        super(ExceptionCode.SYSTEM.name(), message);
    }

    public SystemException(String code, String message) {
        super(code, message);
    }
}
