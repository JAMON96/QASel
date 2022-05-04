package com.jamon.qaseluser.service;

import com.jamon.qaselcommon.util.JsonData;
import com.jamon.qaseluser.model.request.GetAnswerRequest;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/13 21:01
 */
public interface AnswerService {

    JsonData getAnswerList(GetAnswerRequest request);
}
