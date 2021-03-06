package biubiu.Dao;

import biubiu.Model.Recruit_card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface Recruit_cardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruit_card
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruit_card
     *
     * @mbggenerated
     */
    int insert(Recruit_card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruit_card
     *
     * @mbggenerated
     */
    int insertSelective(Recruit_card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruit_card
     *
     * @mbggenerated
     */
    Recruit_card selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruit_card
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Recruit_card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruit_card
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Recruit_card record);
    List<Recruit_card> selectAll();
    List<Integer> selectByObject(@Param("objectcategory") String objectcategory, @Param("objectid") String objectid);
}