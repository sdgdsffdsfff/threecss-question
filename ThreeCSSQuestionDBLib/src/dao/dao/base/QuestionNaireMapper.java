package dao.dao.base;

import dao.model.base.QuestionNaire;
import dao.model.base.QuestionNaireCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionNaireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    long countByExample(QuestionNaireCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int deleteByExample(QuestionNaireCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int insert(QuestionNaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int insertSelective(QuestionNaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    List<QuestionNaire> selectByExample(QuestionNaireCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    QuestionNaire selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") QuestionNaire record, @Param("example") QuestionNaireCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") QuestionNaire record, @Param("example") QuestionNaireCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(QuestionNaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_naire
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QuestionNaire record);
}