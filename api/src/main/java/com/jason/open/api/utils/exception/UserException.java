package com.jason.open.api.utils.exception;

/**
 * @Description 用户异常
 * @Date 2020/9/11 14:19
 * @Author by 尘心
 */
public class UserException extends RuntimeException{

    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}
