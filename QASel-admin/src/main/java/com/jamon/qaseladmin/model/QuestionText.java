package com.jamon.qaseladmin.model;


import lombok.Data;

@Data
public class QuestionText {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_text.id
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_text.question
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    private String question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_text.label
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
    private Integer label;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_text.id
     *
     * @return the value of question_text.id
     *
     * @mbg.generated Mon Apr 11 20:50:31 CST 2022
     */
}