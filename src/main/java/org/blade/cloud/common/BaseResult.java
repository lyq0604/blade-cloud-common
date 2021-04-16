package org.blade.cloud.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.blade.cloud.common.enums.ResultCode;

import java.io.Serializable;

/**
 * @author lyq on 2021-04-17 上午12:08
 * @desc
 */
@Data
@NoArgsConstructor
public class BaseResult<T> implements Serializable {

    private Integer code;
    private T data;
    private String message;

    public BaseResult(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
    }

    public BaseResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public BaseResult(int code, T data, String message) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static BaseResult success() {
        BaseResult response = new BaseResult(ResultCode.SUCCESS);
        return response;
    }

    public static <T> BaseResult success(T data) {
        BaseResult<T> response = new BaseResult<>(ResultCode.SUCCESS);
        response.setData(data);
        return response;
    }

    public static BaseResult success(String message) {
        BaseResult response = new BaseResult(ResultCode.SUCCESS);
        response.setMessage(message);
        return response;
    }

    public static <T> BaseResult success(T data, String message) {
        BaseResult<T> response = new BaseResult<>(ResultCode.SUCCESS);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    public static BaseResult error() {
        BaseResult response = new BaseResult(ResultCode.ERROR);
        return response;
    }

    public static BaseResult error(String message) {
        BaseResult response = new BaseResult(ResultCode.ERROR);
        response.setMessage(message);
        return response;
    }

    public static BaseResult invalid() {
        BaseResult response = new BaseResult(ResultCode.INVALID);
        return response;
    }

    public static BaseResult invalid(String message) {
        BaseResult response = new BaseResult(ResultCode.INVALID);
        response.setMessage(message);
        return response;
    }
}

