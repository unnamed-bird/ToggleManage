package com.corp.test.service;


import com.corp.test.dao.SwSwitchDao;
import com.corp.test.entity.SwSwitch;



import com.ibeetl.admin.core.service.CoreBaseService;
import com.ibeetl.admin.core.util.PlatformException;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;






/**
 * SwSwitch Service
 */

@Service
@Transactional
public class SwSwitchService extends CoreBaseService<SwSwitch>{

    @Autowired private SwSwitchDao toggleDao;

    public PageQuery<SwSwitch>queryByCondition(PageQuery query){
        PageQuery ret =  toggleDao.queryByCondition(query);
        queryListAfter(ret.getList());
        return ret;
    }

    public void batchDelSwSwitch(List<Long> ids){
        try {
            toggleDao.batchDelSwSwitchByIds(ids);
        } catch (Exception e) {
            throw new PlatformException("批量删除SwSwitch失败", e);
        }
    }
}