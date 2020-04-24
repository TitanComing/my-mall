package com.peng.mall.common.exception;

import com.peng.mall.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Create by peng on 2020/4/24.
 */
public class Asserts {

    public static void fail(String message) { throw new ApiException(message);}

    public static void fail(IErrorCode errorCode) { throw new ApiException(errorCode); }

}
