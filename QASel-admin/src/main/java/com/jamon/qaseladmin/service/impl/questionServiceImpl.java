package com.jamon.qaseladmin.service.impl;

import com.jamon.qaseladmin.mapper.AnswerTextMapper;
import com.jamon.qaseladmin.mapper.QuestionTextMapper;
import com.jamon.qaseladmin.model.AnswerText;
import com.jamon.qaseladmin.model.QuestionText;
import com.jamon.qaseladmin.model.request.AddQuestionRequest;
import com.jamon.qaseladmin.model.request.GetAllquestionRequest;
import com.jamon.qaseladmin.model.request.GetIdRequest;
import com.jamon.qaseladmin.service.QuestionService;
import com.jamon.qaselcommon.util.JsonData;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/11 17:53
 */
@Service
public class questionServiceImpl implements QuestionService {

    @Resource
    private QuestionTextMapper questionTextMapper;

    @Resource
    private AnswerTextMapper answerTextMapper;


    @Override
    public JsonData getAllquestion(GetAllquestionRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<QuestionText> questionList = questionTextMapper.getAllQuestion();
        PageInfo<QuestionText> pageInfo = new PageInfo(questionList);
        HashMap<String, Object> pageMap = new HashMap<>();
        pageMap.put("totalPage",pageInfo.getPages());
        pageMap.put("totalSize",pageInfo.getTotal());
        pageMap.put("list",questionList);

        return JsonData.buildSuccess(pageMap);
    }

    @Override
    public JsonData addQuestion(AddQuestionRequest request) {
        int insert = questionTextMapper.insert(request);
        return JsonData.buildSuccess(insert);
    }

    @Override
    public JsonData deleteQuestion(GetIdRequest request) {
        if (null == questionTextMapper.selectByPrimaryKey(request.getId())){
            return JsonData.buildSuccess("当前问题不存在，请刷新后重试");
        }
        List<AnswerText> answerList = answerTextMapper.selectAllByQid(request.getId());
        if (answerList.size() != 0){
            return JsonData.buildSuccess("当前问题下存在答案，不能删除！");
        }
        int i = questionTextMapper.deleteByPrimaryKey(request.getId());
        return JsonData.buildSuccess(i);
    }
}
