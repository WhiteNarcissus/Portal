<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
   
  
   <script type="text/javascript" src="${basePath}/js/views/blog/blog.js"></script>
   
    <script type="text/javascript">
        function blogSave() {
        
         var blogContext = $('.summernote').summernote('code');
         alert(blogContext);
            $.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "blogSave.do" ,//url
                data: $('#blogForm').serialize(),blogContext,
                success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.resultCode == 200) {
                        alert("SUCCESS");
                    }
                    ;
                },
                error : function() {
                    alert("异常sss！");
                }
            });
        }
    </script>
  </head>
  <body>
     <div id="form-div">
    <form id="blogForm" onsubmit="return false" action="##" method="post">
        <p>title：<input id="blogTitle" name="blogTitle" type="text" size="15" value=""/></p>
        <p>content：<input class="summernote" name="blogContext" type="hidden" /></p>
        <p><input type="button" value="提交" onclick="blogSave()">&nbsp;<input type="reset" value="重置"></p>
    </form>
</div>
  </body>
</html>


