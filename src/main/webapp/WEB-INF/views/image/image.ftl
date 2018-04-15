<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
    
  </head>
  <body>	·	
   
 
   <#list imageList as image>
     图片序号:${ image_index}   说明：${image.imageUrl} <br/>
   <a href="#"> <img  src="http://localhost:8080${basePath}/${image.imageUrl}"></a>     
   </#list>
  
     <br/><button type="button" >返回编辑页面</button>
  </body>
</html>


