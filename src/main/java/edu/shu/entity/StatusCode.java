package edu.shu.entity;

public class StatusCode {

    private StatusCode() {  //Prevents instantiation
    }

    public static final int OK = 2000;  //成功
    public static final int ERROR = 2001;   //失败
    public static final int LOGINERROR = 2002;  //用户名或密码错误

}
