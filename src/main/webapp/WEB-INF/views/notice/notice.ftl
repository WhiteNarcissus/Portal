<!D
OCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
  
  </head>
  <body>
  <#list noticeList as notice>
     <br/>  公告序号:${ notice_index}  公告标题：${notice.noticeTitle}  <br/> 公告内容：${notice.noticeContext} <br/> 公告内容：${notice.createTime?string("yyyy-MM-dd HH:mm:ss")}     
      <br/> 
      <br/>
      <br/>  
   </#list>
  </body>
</html>


