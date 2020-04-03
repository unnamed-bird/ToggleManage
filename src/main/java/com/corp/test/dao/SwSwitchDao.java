package com.corp.test.dao;

import java.util.List;

import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.beetl.sql.core.engine.PageQuery;

import  com.corp.test.entity.*;

/**
 * SwSwitch Dao
 */
@SqlResource("cms.toggle")
public interface SwSwitchDao extends BaseMapper<SwSwitch>{
    public PageQuery<SwSwitch> queryByCondition(PageQuery query);
    public void batchDelSwSwitchByIds( List<Long> ids);
}