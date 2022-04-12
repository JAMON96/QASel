package com.jamon.qaseladmin.model.request;

import lombok.Data;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/12 14:40
 */
@Data
public class AddAnswerRequest {

    private Integer qid;

    private String answer;

    private Integer label;

    private Float score;
}
