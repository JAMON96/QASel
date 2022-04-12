package com.jamon.qaseladmin.model.request;

import lombok.Data;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/12 10:37
 */
@Data
public class AddQuestionRequest {

    private String question;

    private Integer label;
}
