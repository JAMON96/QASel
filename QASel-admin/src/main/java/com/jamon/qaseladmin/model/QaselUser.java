package com.jamon.qaseladmin.model;

public class QaselUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qasel_user.id
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qasel_user.nickname
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qasel_user.phone
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    private Integer phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qasel_user.address
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qasel_user.password
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qasel_user.id
     *
     * @return the value of qasel_user.id
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qasel_user.id
     *
     * @param id the value for qasel_user.id
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qasel_user.nickname
     *
     * @return the value of qasel_user.nickname
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qasel_user.nickname
     *
     * @param nickname the value for qasel_user.nickname
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qasel_user.phone
     *
     * @return the value of qasel_user.phone
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qasel_user.phone
     *
     * @param phone the value for qasel_user.phone
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qasel_user.address
     *
     * @return the value of qasel_user.address
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qasel_user.address
     *
     * @param address the value for qasel_user.address
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qasel_user.password
     *
     * @return the value of qasel_user.password
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qasel_user.password
     *
     * @param password the value for qasel_user.password
     *
     * @mbg.generated Tue Apr 12 21:31:22 CST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}