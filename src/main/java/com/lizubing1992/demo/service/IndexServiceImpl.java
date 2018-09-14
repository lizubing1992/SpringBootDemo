package com.lizubing1992.demo.service;

import com.lizubing1992.demo.dao.UserDOMapper;
import com.lizubing1992.demo.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by administrator on 2018/9/14.
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Override
    public UserDO getUserById(Integer id) {
        return userDOMapper.selectByPrimaryKey(id);
    }
}
