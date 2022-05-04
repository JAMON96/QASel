package com.jamon.qaseluser.service;

import com.jamon.qaselcommon.util.JsonData;
import com.jamon.qaseluser.model.request.GetAllquestionRequest;
import com.jamon.qaseluser.model.request.SearchQuestionRequest;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/13 14:59
 */

public interface QuestionService {

    JsonData getAllquestion();

    JsonData searchQuestion(SearchQuestionRequest request);
}
