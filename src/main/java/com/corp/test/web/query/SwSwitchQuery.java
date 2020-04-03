package com.corp.test.web.query;

import org.apache.commons.lang3.StringUtils;
import com.ibeetl.admin.core.annotation.Query;
import com.ibeetl.admin.core.util.Tool;
import com.ibeetl.admin.core.util.enums.CoreDictType;
import com.ibeetl.admin.core.web.query.PageParam;
import java.util.Date;
/**
 *SwSwitch查询
 */
public class SwSwitchQuery extends PageParam {
    @Query(name = "开关名", display = true)
    private String name;
    public String getName(){
        return  name;
    }
    public void setName(String name ){
        this.name = name;
    }
 
}
