package com.jamon.qaseluser.service.Impl;

import com.jamon.qaselcommon.util.JsonData;
import com.jamon.qaseluser.mapper.AnswerTextMapper;
import com.jamon.qaseluser.mapper.QuestionTextMapper;
import com.jamon.qaseluser.model.AnswerText;
import com.jamon.qaseluser.model.request.GetAnswerRequest;
import com.jamon.qaseluser.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/13 21:01
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Resource
    private AnswerTextMapper answerTextMapper;

    @Resource
    private QuestionTextMapper questionTextMapper;

    @Override
    public JsonData getAnswerList(GetAnswerRequest request) {
        List<AnswerText> answerList = answerTextMapper.selectAllByQid(request.getQid());
        return JsonData.buildSuccess(answerList);
    }
}
