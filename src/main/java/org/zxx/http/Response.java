package org.zxx.http;

import org.zxx.exception.LunaException;

public class Response {
    private String id;
    private Object result;
    private LunaException error;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public LunaException getError() {
        return error;
    }

    public void setError(LunaException error) {
        this.error = error;
    }
}
