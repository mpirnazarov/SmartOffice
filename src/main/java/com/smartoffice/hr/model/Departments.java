package com.smartoffice.hr.model;

public class Departments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.departments.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.departments.name
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.departments.id
     *
     * @return the value of hr.departments.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.departments.id
     *
     * @param id the value for hr.departments.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.departments.name
     *
     * @return the value of hr.departments.name
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.departments.name
     *
     * @param name the value for hr.departments.name
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}