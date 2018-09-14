package com.lizubing1992.demo.dao;

import com.lizubing1992.demo.model.AuthorDO;
import com.lizubing1992.demo.model.AuthorDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorDOMapper {
    long countByExample(AuthorDOExample example);

    int deleteByExample(AuthorDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthorDO record);

    int insertSelective(AuthorDO record);

    List<AuthorDO> selectByExample(AuthorDOExample example);

    AuthorDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthorDO record, @Param("example") AuthorDOExample example);

    int updateByExample(@Param("record") AuthorDO record, @Param("example") AuthorDOExample example);

    int updateByPrimaryKeySelective(AuthorDO record);

    int updateByPrimaryKey(AuthorDO record);
}