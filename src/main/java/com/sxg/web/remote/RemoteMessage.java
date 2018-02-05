package com.sxg.web.remote;

public class RemoteMessage {

    private String requestId;
    private String serviceName;
    private String methodName;
    private Class<?>[] paramType;
    private Object[] params;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?>[] getParamType() {
        return paramType;
    }

    public void setParamType(Class<?>[] paramType) {
        this.paramType = paramType;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
