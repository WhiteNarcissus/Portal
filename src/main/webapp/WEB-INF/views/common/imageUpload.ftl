<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>图片上传</title>  


</head>  
<body>  

<td style="width: 160px;font-size: 9pt;">
<form action="${basePath}/imageUpload.do" method="post" enctype="multipart/form-data">
 照片<input type="file" id="photo" name="photoPaths" style="width: 65px;font-size: 9pt;">
    <input type = "submit" value = "提交"> 
 </form> 
</td>

<td rowspan="5">
 <div id="img_photo" class="text_info clearfix" style="text-align: center;">
  <img id="photo_img" style="width: 120px;height: 150px;">
 </div>
</td>
 
<script type="text/javascript">
//回显图片
$("#photo").change(function() {
var $file = $(this);
var fileObj = $file[0];
var windowURL = window.URL || window.webkitURL;
var dataURL;
var $img = $("#photo_img");
if(fileObj && fileObj.files && fileObj.files[0]){
dataURL = windowURL.createObjectURL(fileObj.files[0]);
$img.attr('src',dataURL);
}else{
dataURL = $file.val();
var imgObj = document.getElementById("photo_img");
imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
imgObj.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;
}
});
</script>
  
</body>  
</html>  