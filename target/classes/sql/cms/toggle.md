queryByCondition
===


    select 
    @pageTag(){
    t.*
    @}
    from sw_switch t
    where 1=1  
    @//数据权限，该sql语句功能点,如果不考虑数据权限，可以删除此行  
    and #function("toggle.query")#
    @if(!isEmpty(name)){
        and  t.name =#name#
    @}
    
    
    

batchDelSwSwitchByIds
===

* 批量逻辑删除

    update sw_switch set del_flag = 1 where id  in( #join(ids)#)
    
