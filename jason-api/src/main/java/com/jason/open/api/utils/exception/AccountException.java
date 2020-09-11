package com.jason.open.api.utils.exception;

/**
 * @Description 账号授权异常类型
 * @Date 2020/9/11 13:42
 * @Author by 尘心
 */
public class AccountException extends RuntimeException{

    public AccountException() {
        super();
    }

    public AccountException(String message) {
        super(message);
    }
}
