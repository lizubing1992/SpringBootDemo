package com.lizubing1992.demo.service;

import com.lizubing1992.demo.model.UserDO;
import org.springframework.stereotype.Service;

/**
 * Created by administrator on 2018/9/14.
 */

public interface IndexService {
    UserDO getUserById(Integer id);
}
