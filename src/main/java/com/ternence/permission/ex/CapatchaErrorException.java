package com.ternence.permission.ex;

/**
 * create by 陶江航 at 2017/10/22 23:35
 *
 * @version 1.0
 * @email taojianghang@xinzhentech.com
 * @description 验证码错误异常
 */
public class CapatchaErrorException extends Exception {
    public CapatchaErrorException() {
    }

    public CapatchaErrorException(String message) {
        super(message);
    }
}
