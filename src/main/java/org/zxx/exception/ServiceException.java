package org.zxx.exception;

public class ServiceException extends LunaException {
    public ServiceException(String message) {
        super(ExceptionCode.SERVICE.name(), message);
    }

    public ServiceException(String code, String message) {
        super(code, message);
    }
}
