package com.jamon.qaseladmin.service;

import com.jamon.qaseladmin.model.request.AddQuestionRequest;
import com.jamon.qaseladmin.model.request.GetAllquestionRequest;
import com.jamon.qaseladmin.model.request.GetIdRequest;
import com.jamon.qaseladmin.model.request.SearchQuestionRequest;
import com.jamon.qaselcommon.util.JsonData;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/11 17:52
 */

public interface QuestionService {

    JsonData getAllquestion();

    JsonData addQuestion(AddQuestionRequest request);

    JsonData deleteQuestion(GetIdRequest request);

    JsonData searchQuestion(SearchQuestionRequest request);

}
