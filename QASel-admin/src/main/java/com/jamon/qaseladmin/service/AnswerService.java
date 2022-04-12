package com.jamon.qaseladmin.service;

import com.jamon.qaseladmin.model.AnswerText;
import com.jamon.qaseladmin.model.request.AddAnswerRequest;
import com.jamon.qaseladmin.model.request.DeleteAnswerRequest;
import com.jamon.qaseladmin.model.request.GetAnswerRequest;
import com.jamon.qaselcommon.util.JsonData;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/12 11:01
 */
public interface AnswerService {

    JsonData getAnswerList(GetAnswerRequest request);

    JsonData addAnswer(AddAnswerRequest request);

    JsonData deleteAnswer(DeleteAnswerRequest request);
}
