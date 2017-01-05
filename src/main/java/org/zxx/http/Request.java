package org.zxx.http;

import java.util.Map;

public class Request {
    private String id;
    private String service;
    private String method;
    private Map<String, Object> metas;
    private Map<String, Object> params;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Object> getMetas() {
        return metas;
    }

    public void setMetas(Map<String, Object> metas) {
        this.metas = metas;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
