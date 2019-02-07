package com.dong.ebook.model;

import java.util.Date;

public class Blog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.classification
     *
     * @mbg.generated
     */
    private String classification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.traffic
     *
     * @mbg.generated
     */
    private Integer traffic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.vote_num
     *
     * @mbg.generated
     */
    private Integer voteNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.comment_num
     *
     * @mbg.generated
     */
    private Integer commentNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.id
     *
     * @return the value of blog.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.id
     *
     * @param id the value for blog.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.user_id
     *
     * @return the value of blog.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.user_id
     *
     * @param userId the value for blog.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.title
     *
     * @return the value of blog.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.title
     *
     * @param title the value for blog.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.summary
     *
     * @return the value of blog.summary
     *
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.summary
     *
     * @param summary the value for blog.summary
     *
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.classification
     *
     * @return the value of blog.classification
     *
     * @mbg.generated
     */
    public String getClassification() {
        return classification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.classification
     *
     * @param classification the value for blog.classification
     *
     * @mbg.generated
     */
    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.traffic
     *
     * @return the value of blog.traffic
     *
     * @mbg.generated
     */
    public Integer getTraffic() {
        return traffic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.traffic
     *
     * @param traffic the value for blog.traffic
     *
     * @mbg.generated
     */
    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.vote_num
     *
     * @return the value of blog.vote_num
     *
     * @mbg.generated
     */
    public Integer getVoteNum() {
        return voteNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.vote_num
     *
     * @param voteNum the value for blog.vote_num
     *
     * @mbg.generated
     */
    public void setVoteNum(Integer voteNum) {
        this.voteNum = voteNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.comment_num
     *
     * @return the value of blog.comment_num
     *
     * @mbg.generated
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.comment_num
     *
     * @param commentNum the value for blog.comment_num
     *
     * @mbg.generated
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.create_time
     *
     * @return the value of blog.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.create_time
     *
     * @param createTime the value for blog.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.modify_time
     *
     * @return the value of blog.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.modify_time
     *
     * @param modifyTime the value for blog.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}