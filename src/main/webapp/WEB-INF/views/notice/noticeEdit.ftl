<!D
OCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
    <script type="text/javascript" src="${basePath}/js/views/notice/notice.js"></script>
  </head>
  <body>
   <div id="form-div">
    <form id="noticeForm" onsubmit="return false" action="##" method="post">
        <p>title：<input id="noticeTitle" name="noticeTitle" type="text" size="15" value=""/></p>
        <p>content：<input id="noticeContext" name="noticeContext" type="text" /></p>
        <p><input type="button" value="提交" onclick="noticeSave()">&nbsp;<input type="reset" value="重置"></p>
    </form>
   </div>
  </body>
</html>


