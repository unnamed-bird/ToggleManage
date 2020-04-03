layui.define(['table', 'toggleApi'], function(exports) {
    var toggleApi = layui.toggleApi;
    var table=layui.table;
    var view = {
        init:function(){
        },
        delBatch:function(){
            var data = Common.getMoreDataFromTable(table,"toggleTable");
            if(data==null){
                return ;
            }
            Common.openConfirm("确认要删除这些SwSwitch?",function(){
            var ids =Common.concatBatchId(data,"id");
            toggleApi.del(ids,function(){
                Common.info("删除成功");
                    dataReload();
                })
            })
        }
    }
    exports('del',view);
	
});