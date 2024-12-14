package com.example.demo.common.CommonResult;

import com.example.demo.enums.CommonResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 全局统一返回结果类
 */
@Data
@ApiModel(value = "全局统一返回结果")
public class CommonResult<T> {

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private T data;

    public CommonResult(){}

    protected static <T> CommonResult<T> build(T data) {
        CommonResult<T> CommonResult = new CommonResult<T>();
        if (data != null)
            CommonResult.setData(data);
        return CommonResult;
    }

    public static <T> CommonResult<T> build(T body, CommonResultCodeEnum CommonResultCodeEnum) {
        CommonResult<T> CommonResult = build(body);
        CommonResult.setCode(CommonResultCodeEnum.getCode());
        CommonResult.setMessage(CommonResultCodeEnum.getMessage());
        return CommonResult;
    }

    public static <T> CommonResult<T> build(Integer code, String message) {
        CommonResult<T> CommonResult = build(null);
        CommonResult.setCode(code);
        CommonResult.setMessage(message);
        return CommonResult;
    }

    public static<T> CommonResult<T> ok(){
        return CommonResult.ok(null);
    }

    /**
     * 操作成功
     * @param data
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> ok(T data){
        CommonResult<T> CommonResult = build(data);
        return build(data, CommonResultCodeEnum.SUCCESS);
    }

    public static<T> CommonResult<T> fail(){
        return CommonResult.fail(null);
    }

    /**
     * 操作失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> fail(T data){
        CommonResult<T> CommonResult = build(data);
        return build(data, CommonResultCodeEnum.FAIL);
    }

    public CommonResult<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public CommonResult<T> code(Integer code){
        this.setCode(code);
        return this;
    }

    public boolean isOk() {
        if(this.getCode().intValue() == CommonResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }
}