package com.lizubing1992.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.lizubing1992.demo.model.AuthorBean")
public class AuthorBean {
    @ApiModelProperty(value="id用户ID")
    private Long id;

    @ApiModelProperty(value="realName用户名称")
    private String realName;

    @ApiModelProperty(value="nickName用户匿名")
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}