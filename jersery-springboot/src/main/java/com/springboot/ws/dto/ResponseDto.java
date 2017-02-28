package com.springboot.ws.dto;

/**
 * Created by zbz on 2017/2/28.
 */
public class ResponseDto<T> {
    private T obj;
    private T objs;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObjs() {
        return objs;
    }

    public void setObjs(T objs) {
        this.objs = objs;
    }
}
