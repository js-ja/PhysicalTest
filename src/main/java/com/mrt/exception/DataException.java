package com.mrt.exception;

public class DataException extends RuntimeException {
    private Integer code;

    public DataException(Integer code) {
        this.code = code;
    }

    public DataException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public DataException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public DataException(Throwable cause, Integer code) {
        super(cause);
        this.code = code;
    }

    public DataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
