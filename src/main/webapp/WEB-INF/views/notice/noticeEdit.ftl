<!D
OCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
    <script type="text/javascript" src="${basePath}/js/views/notice/notice.js"></script>
    
      <script type="text/javascript">
        function noiceSave() {
        
        
            $.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "noticeSave.do" ,//url
                data: $('#noticeForm').serialize(),
                success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.resultCode == 200) {
                        alert("SUCCESS");
                    }
                    ;
                },
                error : function() {
                  
                }
            });
        }
    </script>
  </head>
  <body>

    <form id="noticeForm" onsubmit="return false" action="##" method="post">
        <p>title：<input id="noticeTitle" name="noticeTitle" type="text" size="15" value=""/></p>
        <p>content：<textarea id="noticeContext" name="noticeContext" type="text"  rows="10" cols="40"></textarea></p>
        <p><input type="button" value="提交" onclick="noticeSave()">&nbsp;<input type="reset" value="重置"></p>
    </form>

  </body>
</html>


