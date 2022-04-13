package com.jamon.qaseluser.model.request;

import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/11 20:57
 */

@Data
public class GetAllquestionRequest {

    @Min(1)
    private int pageNum = 1;

    @Min(10)
    private int pageSize = 10;
}
