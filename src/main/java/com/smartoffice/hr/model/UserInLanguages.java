package com.smartoffice.hr.model;

public class UserInLanguages {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.user_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.language_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private Integer languageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.listening
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String listening;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.reading
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String reading;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.writing
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String writing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr.user_in_languages.speaking
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    private String speaking;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.id
     *
     * @return the value of hr.user_in_languages.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.id
     *
     * @param id the value for hr.user_in_languages.id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.user_id
     *
     * @return the value of hr.user_in_languages.user_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.user_id
     *
     * @param userId the value for hr.user_in_languages.user_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.language_id
     *
     * @return the value of hr.user_in_languages.language_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.language_id
     *
     * @param languageId the value for hr.user_in_languages.language_id
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.listening
     *
     * @return the value of hr.user_in_languages.listening
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getListening() {
        return listening;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.listening
     *
     * @param listening the value for hr.user_in_languages.listening
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setListening(String listening) {
        this.listening = listening == null ? null : listening.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.reading
     *
     * @return the value of hr.user_in_languages.reading
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getReading() {
        return reading;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.reading
     *
     * @param reading the value for hr.user_in_languages.reading
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setReading(String reading) {
        this.reading = reading == null ? null : reading.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.writing
     *
     * @return the value of hr.user_in_languages.writing
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getWriting() {
        return writing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.writing
     *
     * @param writing the value for hr.user_in_languages.writing
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setWriting(String writing) {
        this.writing = writing == null ? null : writing.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr.user_in_languages.speaking
     *
     * @return the value of hr.user_in_languages.speaking
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public String getSpeaking() {
        return speaking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr.user_in_languages.speaking
     *
     * @param speaking the value for hr.user_in_languages.speaking
     *
     * @mbg.generated Fri May 05 11:45:26 UZT 2017
     */
    public void setSpeaking(String speaking) {
        this.speaking = speaking == null ? null : speaking.trim();
    }
}