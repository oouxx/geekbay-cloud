package com.geekbay.geekbayAdmin.model.mapper;

import com.geekbay.geekbayAdmin.model.dao.Verifycode;
import com.geekbay.geekbayAdmin.model.dao.VerifycodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerifycodeMapper {
    long countByExample(VerifycodeExample example);

    int deleteByExample(VerifycodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Verifycode record);

    int insertSelective(Verifycode record);

    List<Verifycode> selectByExample(VerifycodeExample example);

    Verifycode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Verifycode record, @Param("example") VerifycodeExample example);

    int updateByExample(@Param("record") Verifycode record, @Param("example") VerifycodeExample example);

    int updateByPrimaryKeySelective(Verifycode record);

    int updateByPrimaryKey(Verifycode record);
}