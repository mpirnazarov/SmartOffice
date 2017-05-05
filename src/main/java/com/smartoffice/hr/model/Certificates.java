package com.smartoffice.hr.model;

import java.util.Date;

public class Certificates {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.name
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.organization
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String organization;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.date
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.mark
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String mark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.passed
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Boolean passed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.number
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.type
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.degree
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String degree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.certificates.user_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.id
     *
     * @return the value of hr.certificates.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.id
     *
     * @param id the value for hr.certificates.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.name
     *
     * @return the value of hr.certificates.name
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.name
     *
     * @param name the value for hr.certificates.name
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.organization
     *
     * @return the value of hr.certificates.organization
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.organization
     *
     * @param organization the value for hr.certificates.organization
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.date
     *
     * @return the value of hr.certificates.date
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.date
     *
     * @param date the value for hr.certificates.date
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.mark
     *
     * @return the value of hr.certificates.mark
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.mark
     *
     * @param mark the value for hr.certificates.mark
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.passed
     *
     * @return the value of hr.certificates.passed
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Boolean getPassed() {
        return passed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.passed
     *
     * @param passed the value for hr.certificates.passed
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.number
     *
     * @return the value of hr.certificates.number
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.number
     *
     * @param number the value for hr.certificates.number
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.type
     *
     * @return the value of hr.certificates.type
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.type
     *
     * @param type the value for hr.certificates.type
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.degree
     *
     * @return the value of hr.certificates.degree
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getDegree() {
        return degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.degree
     *
     * @param degree the value for hr.certificates.degree
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.certificates.user_id
     *
     * @return the value of hr.certificates.user_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.certificates.user_id
     *
     * @param userId the value for hr.certificates.user_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}