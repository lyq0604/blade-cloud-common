package org.blade.cloud.common.enums;

/**
 * @author lyq on 2021-04-17 上午12:18
 * @desc 响应码枚举类
 */
public enum ResultCode {

    SUCCESS(200, "请求成功"),
    INVALID(400, "参数错误"),
    ERROR(500, "服务器内部错误");

    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
