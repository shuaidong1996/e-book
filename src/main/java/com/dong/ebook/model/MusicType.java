package com.dong.ebook.model;

public class MusicType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_type.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_type.class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_type.id
     *
     * @return the value of music_type.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_type.id
     *
     * @param id the value for music_type.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_type.class_name
     *
     * @return the value of music_type.class_name
     *
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_type.class_name
     *
     * @param className the value for music_type.class_name
     *
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}