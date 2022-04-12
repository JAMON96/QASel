package com.jamon.qaselcommon.enums;

import lombok.Getter;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/11 17:47
 */
public enum BizeCodeEnum {
    /**
     * 通用操作码
     */
    OPS_REPEAT(110001, "重复操作"),

    /**
     * 验证码
     */
    CODE_TO_ERROR(240001, "接收号码不合规"),
    CODE_LIMITED(240002, "验证码发送过快"),
    CODE_ERROR(240003, "验证码错误"),
    CODE_CAPTCHA_ERROR(240101, "图形验证码错误"),

    /**
     * 账号
     */
    ACCOUNT_REPEAT(250001, "账号已经存在"),
    ACCOUNT_UNREGISTER(250002, "账号不存在"),
    ACCOUNT_PWD_ERROR(250003, "账号或者密码错误"),
    ACCOUNT_UNLOGIN(250004, "账号未登录"),

    /**
     * 字典
     */
    DICT_REPEAT(260001,"字典项重复"),
    DICT_NOTNULL(260002,"字典项下有内容"),
    DICT_NULL(26003,"字典内容为空"),
    DICT_ERROR(26004,"SQL语句出错"),
    DICT_AREA_TREE_ERROR(26005,"获取地区树失败"),
    DICT_TREE_ERROR(26006,"获取字典树失败"),

    /**
     * 政策解读
     */
    POLICY_NULL(270001,"政策不存在"),
    POLICY_ERROR(270002,"操作出错,请检查输入数据"),
    POLICY_NOTNULL(270003,"该政策解读编号已存在，请核对后重试"),
    POLICY_OVERSIZE(270004,"最大下载量不能超过50000条"),
    POLICY_URLNULL(270005,"模板地址为空！"),
    POLICYANALYSIS_NULL(27006,"政策解读不存在"),
    POLICYANALYSIS_NOTNULL(27007,"政策解读已存在"),
    POLICYANALYSIS_REPEAT(27008,"主键重复，插入失败"),

    /**
     * 统一内部错误
     */
    INNER_ERROR(500001,"服务器内部错误"),

    /**
     * 文件相关
     */
    FILE_UPLOAD_USER_IMG_FAIL(600101, "用户头像文件上传失败"),
    FILE_UPLOAD_FAIL(600102, "文件上传失败"),
    FILE_SIZE_MAX(600102, "文件大小超出限制");

    @Getter
    private String msg;

    @Getter
    private int code;

    BizeCodeEnum(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }
}
