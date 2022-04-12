package com.jamon.qaseladmin.mapper;

import com.jamon.qaseladmin.model.QuestionText;
import com.jamon.qaseladmin.model.request.AddQuestionRequest;

import java.util.List;


public interface QuestionTextMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_text
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_text
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    int insert(AddQuestionRequest request);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_text
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    int insertSelective(QuestionText record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_text
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    QuestionText selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_text
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    int updateByPrimaryKeySelective(QuestionText record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_text
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    int updateByPrimaryKey(QuestionText record);

//    获取数据库中所有问题
    List<QuestionText> getAllQuestion();
}