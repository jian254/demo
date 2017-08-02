package com.jian.entity;

/**
 * Created by jian on 17/7/28.
 * 返回的数据
 */
public class Result<T> {
    private int status;//0为成功，其余的都为失败
    private String info;//失败信息提示
    private T data;

    public Result(int status, String info, T data) {
        this.status = status;
        this.info = info;
        this.data = data;
    }

    public Result() {
        status = 1;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", info='" + info + '\'' +
                ", data=" + data +
                '}';
    }
}
