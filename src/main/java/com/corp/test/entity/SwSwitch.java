package com.corp.test.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.beetl.sql.core.annotatoin.AutoID;
import org.beetl.sql.core.annotatoin.SeqID;

import com.ibeetl.admin.core.util.ValidateConfig;

import org.beetl.sql.core.TailBean;
import java.math.*;

import com.ibeetl.admin.core.annotation.Dict;
import com.ibeetl.admin.core.entity.BaseEntity;

import org.beetl.sql.core.annotatoin.InsertIgnore;
import org.beetl.sql.core.annotatoin.Version;
import org.beetl.sql.core.annotatoin.LogicDelete;


/* 
* 开关表
* gen by Spring Boot2 Admin 2020-03-22
*/
public class SwSwitch extends BaseEntity{

    //主键
    @NotNull(message = "ID不能为空", groups =ValidateConfig.UPDATE.class)
    @SeqID(name = ORACLE_CORE_SEQ_NAME)
    @AutoID	

    private Integer id ;
	
    //应用主键

    private Integer appId ;
	
    //开关名

    private String name ;
	
    //开关唯一键，在应用的namespace 唯一

    private String nameKey ;
	
    //开关描述

    private String nameDesc ;
	
    //负责人邮箱地址

    private String ownerEmail ;
	
    //-1: deleted, 1: normal

    private Integer status ;
	
    //1:普通开关（true、false） ，2: 正则匹配 ，3：灰度类型，4：百分比类型

    private Integer type ;
	
    //创建时间

    private Date createtime ;
	
    //更新时间

    private Date updatetime ;
	
    public SwSwitch(){
    }

    /**主键
    *@return 
    */
    public Integer getId(){
        return  id;
    }
    /**主键
    *@param  id
    */
    public void setId(Integer id){
        this.id = id;
    }

    /**应用主键
    *@return 
    */
    public Integer getAppId(){
        return  appId;
    }
    /**应用主键
    *@param  appId
    */
    public void setAppId(Integer appId){
        this.appId = appId;
    }

    /**开关名
    *@return 
    */
    public String getName(){
        return  name;
    }
    /**开关名
    *@param  name
    */
    public void setName(String name){
        this.name = name;
    }

    /**开关唯一键，在应用的namespace 唯一
    *@return 
    */
    public String getNameKey(){
        return  nameKey;
    }
    /**开关唯一键，在应用的namespace 唯一
    *@param  nameKey
    */
    public void setNameKey(String nameKey){
        this.nameKey = nameKey;
    }

    /**开关描述
    *@return 
    */
    public String getNameDesc(){
        return  nameDesc;
    }
    /**开关描述
    *@param  nameDesc
    */
    public void setNameDesc(String nameDesc){
        this.nameDesc = nameDesc;
    }

    /**负责人邮箱地址
    *@return 
    */
    public String getOwnerEmail(){
        return  ownerEmail;
    }
    /**负责人邮箱地址
    *@param  ownerEmail
    */
    public void setOwnerEmail(String ownerEmail){
        this.ownerEmail = ownerEmail;
    }

    /**-1: deleted, 1: normal
    *@return 
    */
    public Integer getStatus(){
        return  status;
    }
    /**-1: deleted, 1: normal
    *@param  status
    */
    public void setStatus(Integer status){
        this.status = status;
    }

    /**1:普通开关（true、false） ，2: 正则匹配 ，3：灰度类型，4：百分比类型
    *@return 
    */
    public Integer getType(){
        return  type;
    }
    /**1:普通开关（true、false） ，2: 正则匹配 ，3：灰度类型，4：百分比类型
    *@param  type
    */
    public void setType(Integer type){
        this.type = type;
    }

    /**创建时间
    *@return 
    */
    public Date getCreatetime(){
        return  createtime;
    }
    /**创建时间
    *@param  createtime
    */
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }

    /**更新时间
    *@return 
    */
    public Date getUpdatetime(){
        return  updatetime;
    }
    /**更新时间
    *@param  updatetime
    */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    }


}
