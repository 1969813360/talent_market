package biubiu.Dao;

import biubiu.Model.Participate_firm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Participate_firmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate_firm
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate_firm
     *
     * @mbggenerated
     */
    int insert(Participate_firm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate_firm
     *
     * @mbggenerated
     */
    int insertSelective(Participate_firm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate_firm
     *
     * @mbggenerated
     */
    Participate_firm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate_firm
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Participate_firm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate_firm
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Participate_firm record);
    List<Participate_firm> selectAll();
}