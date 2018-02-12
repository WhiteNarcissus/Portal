<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
    <script>
     $(function(){
     
     $("button").click(function(){
    $("p").slideToggle();
      });
      
      $('#summernote').summernote({
         lang :'zh-CN',
        
         minHeight : 300,
         dialogsFade : true,
         dialogsInbody : true,
         disableDragAndDrop : false,
          toolbar: [
    // [groupName, [list of button]]
    ['style', ['bold', 'italic', 'underline', 'clear']],
    ['font', ['strikethrough', 'superscript', 'subscript']],
    ['fontsize', ['fontsize']],
    ['color', ['color']],
    ['para', ['ul', 'ol', 'paragraph']],
    ['height', ['height']]
    ['insert', ['table','picture','video']]
      ]
    });
      });
     
    </script>     
  </head>
  <body>
 
 <p id='summernote'>这是一个段落</p>
  <button>切换</button>
  
 <#include "/common/updown.ftl">
  </body>
</html>


