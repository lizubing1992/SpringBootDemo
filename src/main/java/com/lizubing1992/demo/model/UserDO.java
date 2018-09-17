package com.lizubing1992.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.lizubing1992.demo.model.UserDO")
public class UserDO {
    @ApiModelProperty(value="tId编号")
    private Integer tId;

    @ApiModelProperty(value="tName名称")
    private String tName;

    @ApiModelProperty(value="tAge年龄")
    private Integer tAge;

    @ApiModelProperty(value="tAddress家庭住址")
    private String tAddress;

    @ApiModelProperty(value="tPassword")
    private String tPassword;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }
}