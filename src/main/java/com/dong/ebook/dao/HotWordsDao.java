package com.dong.ebook.dao;

import com.dong.ebook.model.HotWords;
import com.dong.ebook.model.HotWordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotWordsDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    long countByExample(HotWordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int deleteByExample(HotWordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int insert(HotWords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int insertSelective(HotWords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    List<HotWords> selectByExample(HotWordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    HotWords selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") HotWords record, @Param("example") HotWordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") HotWords record, @Param("example") HotWordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HotWords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_words
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HotWords record);
}