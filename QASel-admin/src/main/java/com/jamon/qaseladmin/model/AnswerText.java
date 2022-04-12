package com.jamon.qaseladmin.model;


import lombok.Data;

@Data
public class AnswerText {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer_text.id
     *
     * @mbg.generated Tue Apr 12 20:52:08 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer_text.qid
     *
     * @mbg.generated Tue Apr 12 20:52:08 CST 2022
     */
    private Integer qid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer_text.answer
     *
     * @mbg.generated Tue Apr 12 20:52:08 CST 2022
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer_text.score
     *
     * @mbg.generated Tue Apr 12 20:52:08 CST 2022
     */
    private Float score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer_text.label
     *
     * @mbg.generated Tue Apr 12 20:52:08 CST 2022
     */
    private Integer label;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer_text.id
     *
     * @return the value of answer_text.id
     *
     * @mbg.generated Tue Apr 12 20:52:08 CST 2022
     */

}