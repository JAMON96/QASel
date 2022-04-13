package com.jamon.qaseluser.controller;

import com.jamon.qaselcommon.util.JsonData;
import com.jamon.qaseluser.model.request.GetAllquestionRequest;
import com.jamon.qaseluser.model.request.SearchQuestionRequest;
import com.jamon.qaseluser.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/13 11:18
 */
@RestController
@RequestMapping("/user/question_manage/v1")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("getAllquestion")
    public JsonData getAllquestion(@Valid @RequestBody GetAllquestionRequest request){
        return questionService.getAllquestion(request);
    }

    @PostMapping("searchquestion")
    public JsonData searchQuestion(@Valid @RequestBody SearchQuestionRequest request){
        return questionService.searchQuestion(request);
    }
}
