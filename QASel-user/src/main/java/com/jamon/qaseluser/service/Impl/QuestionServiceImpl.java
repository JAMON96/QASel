package com.jamon.qaseluser.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jamon.qaselcommon.util.JsonData;
import com.jamon.qaseluser.mapper.QuestionTextMapper;
import com.jamon.qaseluser.model.QuestionText;
import com.jamon.qaseluser.model.QuestionVO;
import com.jamon.qaseluser.model.request.GetAllquestionRequest;
import com.jamon.qaseluser.model.request.SearchQuestionRequest;
import com.jamon.qaseluser.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/13 15:00
 */

@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private QuestionTextMapper questionTextMapper;

//    @Resource
//    private AnswerTextMapper answerTextMapper;

    @Override
    public JsonData getAllquestion() {
//        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<QuestionText> questionList = questionTextMapper.getAllQuestion();
//        PageInfo<QuestionText> pageInfo = new PageInfo<>(questionList);
//        PageInfo pageInfo = new PageInfo(questionList);
//        HashMap<String, Object> pageMap = new HashMap<>();
//        pageMap.put("totalPage",pageInfo.getPages());
//        pageMap.put("totalSize",pageInfo.getTotal());
//        pageMap.put("list",questionList);

        return JsonData.buildSuccess(questionList);
    }

    @Override
    public JsonData searchQuestion(SearchQuestionRequest request) {
        List<QuestionVO> questionLists = questionTextMapper.searchQuestion(request);
        for (QuestionVO questionVO : questionLists) {
            questionVO.setValue(questionVO.getLabel());
        }

        return JsonData.buildSuccess(questionLists);
    }
}
