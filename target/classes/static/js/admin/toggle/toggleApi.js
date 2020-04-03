/*访问后台的代码*/
layui.define([], function(exports) {
    var api={
            updateToggle:function(form,callback){
                Lib.submitForm("/admin/toggle/edit.json",form,{},callback)
            },
            addToggle:function(form,callback){
                Lib.submitForm("/admin/toggle/add.json",form,{},callback)
            },
            del:function(ids,callback){
                Common.post("/admin/toggle/delete.json",{"ids":ids},function(){
                    callback();
                })
            }
		
    };
    exports('toggleApi',api);
});