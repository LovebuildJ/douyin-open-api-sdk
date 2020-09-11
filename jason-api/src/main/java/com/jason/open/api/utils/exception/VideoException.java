package com.jason.open.api.utils.exception;

/**
 * @Description 视频管理异常
 * @Date 2020/9/11 14:19
 * @Author by 尘心
 */
public class VideoException extends RuntimeException{

    public VideoException() {
        super();
    }

    public VideoException(String message) {
        super(message);
    }
}
