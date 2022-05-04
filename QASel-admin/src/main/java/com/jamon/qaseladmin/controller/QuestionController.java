package com.jamon.qaseladmin.controller;

import com.jamon.qaseladmin.model.request.AddQuestionRequest;
import com.jamon.qaseladmin.model.request.GetAllquestionRequest;
import com.jamon.qaseladmin.model.request.GetIdRequest;
import com.jamon.qaseladmin.model.request.SearchQuestionRequest;
import com.jamon.qaseladmin.service.QuestionService;
import com.jamon.qaselcommon.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/11 17:35
 */

@RestController
@RequestMapping("/admin/question_manage/v1")
@CrossOrigin
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("getAllquestion")
    public JsonData getAllquestion(){
        return questionService.getAllquestion();
    }

    @PostMapping("addquestion")
    public JsonData addQuestion(@Valid @RequestBody AddQuestionRequest request){
        return questionService.addQuestion(request);
    }

    @PostMapping("deletequestion")//todo:关联答案表做删除
    public JsonData deleteQuestion(@Valid @RequestBody GetIdRequest request){
        return questionService.deleteQuestion(request);
    }

    @PostMapping("searchquestion")
    public JsonData searchQuestion(@Valid @RequestBody SearchQuestionRequest request){
        return questionService.searchQuestion(request);
    }
}
