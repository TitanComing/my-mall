package com.peng.mall.common.exception;

import com.peng.mall.common.api.IErrorCode;

/**
 * 自定义API异常
 * Create by peng on 2020/4/24.
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) { super(message);}

    public ApiException(Throwable cause) { super(cause);}

    public ApiException(String message, Throwable cause) { super(message, cause); }

    public IErrorCode getErrorCode() { return errorCode; }
}
