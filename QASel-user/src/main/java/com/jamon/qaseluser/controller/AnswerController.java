package com.jamon.qaseluser.controller;

import com.jamon.qaselcommon.util.JsonData;
import com.jamon.qaseluser.model.request.GetAnswerRequest;
import com.jamon.qaseluser.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/13 21:01
 */

@RestController
@RequestMapping("/user/answer_manage/v1")
@CrossOrigin
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @PostMapping("getAllanswer")
    public JsonData getAnswer(@Valid @RequestBody GetAnswerRequest request){
        return answerService.getAnswerList(request);
    }
}
