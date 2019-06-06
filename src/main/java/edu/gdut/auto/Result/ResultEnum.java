package edu.gdut.auto.Result;

/**
 * 所有的状态码在这里定义
 */
public enum ResultEnum {

    SUCCESS_LOGIN(1,"成功登陆！"),
    VERCODE_ERROR(5,"验证码错误"),
    VERCODE_EXPIRED(6,"验证码已失效，请重新输入"),
    ID_PARAMETER_ERROR(7,"ID参数出错"),
    PWD_PARAMETER_ERROR(7,"密码参数出错"),
    VERCODE_PARAMETER_ERROR(7,"验证码参数出错"),
    FIND_NONE_ERROR(8,"找不到此用户，请重新校对"),
    PWD_ERROR_MAX(9,"密码错误超过三次，请明天再试试"),
    USER_DELETE_ERROR(10,"用户已删除，请联系管理员"),
    SEARCH_PARAMETER_ERROR(11,"搜索参数出错"),
    SESSION_FIND_NONE(12,"session找不到此用户"),
    COLLEGE_PARAMETER_ERROR(13,"学院代码参数出错"),
    REQUEST_PARAMETER_ERROR(14,"请求的参数出错"),
    REQUEST_PARAMETER_EMPTY(15,"请求的参数为空"),
    DateBase_Insert_Error(16,"数据库插入发生错误"),
    Upload_Error(17,"上传文件出现错误"),
    Upload_UserPic_Empty(18,"图片为空"),
    Upload_UserPic_Error(19,"上传图片出现错误"),
    IsNot_Pic_Error(20,"上传的不是照片，请重新选择!（支持JPG,JPEG,PNG）"),

    PWD_ERROR(11, "密码错误");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
