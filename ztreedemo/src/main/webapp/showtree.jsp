<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>树级组织关系演示案例</title>
<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/styles/zTreeStyle/zTreeStyle.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery.ztree.core.js"></script>
</head>
<body>
 <ul id="tree" class="ztree" style="width:260px; overflow:auto;"></ul>
 <script type="text/javascript">
            var zTree;
            var setting = {
                view: {
                    dblClickExpand: false,
                    showLine: true,
                    selectedMulti: false
                },
                data: {
                    simpleData: {
                        enable:true,
                        idKey: "id",
                        pIdKey: "pId",
                        rootPId: ""
                    }
                },
                callback: {
                    beforeClick: function(treeId, treeNode) {
                        var zTree = $.fn.zTree.getZTreeObj("tree");
                        if (treeNode.isParent) {
                            zTree.expandNode(treeNode);
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            };
            
          
            $(document).ready(function(){
                var t = $("#tree");
                
                /**
                 * zTree 初始化方法：$.fn.zTree.init(t, setting, zNodes)
                 * t:用于展现 zTree 的 DOM 容器
                 * setting:zTree 的配置数据
                 * zNodes:zTree 的节点数据
                 * 
                 */
                 
                 $.ajax({ url: "showtreedata.action",
                	 success: function(data){
                      /*    zNodes =data;
                         console.log(data); */
                         t = $.fn.zTree.init(t, setting, data);
                        },
                     dataType:"json"
                 });
                
               
            });
        </script>
        
</body>
</html>