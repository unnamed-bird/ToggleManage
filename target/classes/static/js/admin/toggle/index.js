layui.define([ 'form', 'laydate', 'table' ], function(exports) {
    var form = layui.form;
    var laydate = layui.laydate;
    var table = layui.table;
    var toggleTable = null;
    var view ={
        init:function(){
            this.initTable();
            this.initSearchForm();
            this.initToolBar();
            window.dataReload = function(){
                Lib.doSearchForm($("#searchForm"),toggleTable)
            }
        },
        initTable:function(){
            toggleTable = table.render({
                elem : '#toggleTable',
                height : Lib.getTableHeight(1),
                cellMinWidth: 100,
                method : 'post',
                url : Common.ctxPath + '/admin/toggle/list.json' // 数据接口
                ,page : Lib.tablePage // 开启分页
                ,limit : 10,
                cols : [ [ // 表头
                    {
                        type : 'checkbox',
                        fixed:'left',
                    },
                {

                    field : 'id', 
                        title : 'id',
                    fixed:'left',
                        width : 60,
                },
                {

                    field : 'appId', 
                        title : 'appId',
                },
                {

                    field : 'name', 
                        title : '开关名',
                },
                {

                    field : 'nameKey', 
                        title : '开关唯一键',
                },
                {

                    field : 'nameDesc', 
                        title : '开关描述',
                },
                {

                    field : 'ownerEmail', 
                        title : '负责人邮箱地址',
                },
                {

                    field : 'status', 
                        title : '开关状态',
                        templet: function(d){
                        return d.status=='-1' ? "已删除":"正常";
                        }
                },
                {

                    field : 'type', 
                        title : '开关类型',
                },
                {

                    field : 'createtime', 
                        title : '创建时间',
                },
                {

                    field : 'updatetime', 
                        title : '更新时间',
                }

        ] ]

        });

            table.on('checkbox(toggleTable)', function(obj){
                var toggle = obj.data;
                if(obj.checked){
                    //按钮逻辑Lib.buttonEnable()
                }else{

                }
            })
        },

        initSearchForm:function(){
            Lib.initSearchForm( $("#searchForm"),toggleTable,form);
        },
        initToolBar:function(){
            toolbar = {
                add : function() { // 获取选中数据
                    var url = "/admin/toggle/add.do";
                    Common.openDlg(url,"开关管理>新增");
                },
                edit : function() { // 获取选中数目
                    var data = Common.getOneFromTable(table,"toggleTable");
                    if(data==null){
                        return ;
                    }
                    var url = "/admin/toggle/edit.do?id="+data.id;
                    Common.openDlg(url,"开关管理>"+data.name+">编辑");
                },
                del : function() {
                    layui.use(['del'], function(){
                        var delView = layui.del
                        delView.delBatch();
                    });
                }
        };
            $('.ext-toolbar').on('click', function() {
                var type = $(this).data('type');
                toolbar[type] ? toolbar[type].call(this) : '';
            });
        }
    }
    exports('index',view);

});