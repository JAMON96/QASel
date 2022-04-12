package com.jamon.qaseladmin.service.impl;

import com.jamon.qaseladmin.mapper.AnswerTextMapper;
import com.jamon.qaseladmin.mapper.QuestionTextMapper;
import com.jamon.qaseladmin.model.AnswerText;
import com.jamon.qaseladmin.model.request.AddAnswerRequest;
import com.jamon.qaseladmin.model.request.DeleteAnswerRequest;
import com.jamon.qaseladmin.model.request.GetAnswerRequest;
import com.jamon.qaseladmin.service.AnswerService;
import com.jamon.qaselcommon.util.JsonData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description :
 * @Author : 张家铭
 * @Date: 2022/4/12 11:01
 */
@Service
public class answerServiceImpl implements AnswerService {

    @Resource
    private AnswerTextMapper answerTextMapper;

    @Resource
    private QuestionTextMapper questionTextMapper;

    @Override
    public JsonData getAnswerList(GetAnswerRequest request) {
        List<AnswerText> answerList = answerTextMapper.selectAllByQid(request.getQid());
        return JsonData.buildSuccess(answerList);
    }

    @Override
    public JsonData addAnswer(AddAnswerRequest request) {
        Integer qid = request.getQid();
        if (null == questionTextMapper.selectByPrimaryKey(qid)){
            return JsonData.buildSuccess("当前问题不存在，请检查后输入");
        }else{
            int insert = answerTextMapper.insert(request);
            return JsonData.buildSuccess(insert);
        }
    }

    @Override
    public JsonData deleteAnswer(DeleteAnswerRequest request) {
        if(null == answerTextMapper.selectByPrimaryKey(request.getId())){
            return JsonData.buildSuccess("当前答案不存在，请刷新后重试");
        }
        int i = answerTextMapper.deleteByPrimaryKey(request.getId());
        return JsonData.buildSuccess(i);
    }
}
