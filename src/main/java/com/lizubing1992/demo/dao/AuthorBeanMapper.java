package com.lizubing1992.demo.dao;

import com.lizubing1992.demo.model.AuthorBean;
import com.lizubing1992.demo.model.AuthorBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorBeanMapper {
    long countByExample(AuthorBeanExample example);

    int deleteByExample(AuthorBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthorBean record);

    int insertSelective(AuthorBean record);

    List<AuthorBean> selectByExample(AuthorBeanExample example);

    AuthorBean selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthorBean record, @Param("example") AuthorBeanExample example);

    int updateByExample(@Param("record") AuthorBean record, @Param("example") AuthorBeanExample example);

    int updateByPrimaryKeySelective(AuthorBean record);

    int updateByPrimaryKey(AuthorBean record);
}