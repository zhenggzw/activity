package com.opvita.activity.dao;

import com.opvita.activity.dto.MActivityDTO;
import com.opvita.activity.dto.MActivityDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MActivityDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int countByExample(MActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int deleteByExample(MActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int insert(MActivityDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int insertSelective(MActivityDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    List<MActivityDTO> selectByExample(MActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    MActivityDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MActivityDTO record, @Param("example") MActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MActivityDTO record, @Param("example") MActivityDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MActivityDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_ACTIVITY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MActivityDTO record);
}