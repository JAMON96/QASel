package com.jamon.qaseladmin.controller;

import com.jamon.qaseladmin.model.AnswerText;
import com.jamon.qaseladmin.model.request.AddAnswerRequest;
import com.jamon.qaseladmin.model.request.DeleteAnswerRequest;
import com.jamon.qaseladmin.model.request.GetAllquestionRequest;
import com.jamon.qaseladmin.model.request.GetAnswerRequest;
import com.jamon.qaseladmin.service.AnswerService;
import com.jamon.qaselcommon.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/12 11:00
 */
@RestController
@RequestMapping("/admin/answer_manage/v1")
@CrossOrigin
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping("getAllanswer")
    public JsonData getAnswer(@Valid @RequestBody GetAnswerRequest request){
        return answerService.getAnswerList(request);
    }

    @PostMapping("addanswer")
    public JsonData addAnswer(@Valid @RequestBody AddAnswerRequest request){
        return answerService.addAnswer(request);
    }

    @PostMapping("delanswer")
    public JsonData deleteAnswer(@Valid @RequestBody DeleteAnswerRequest request){
        return answerService.deleteAnswer(request);
    }

}
