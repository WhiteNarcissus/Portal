<!D
OCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    
    <#include "/common/head.ftl">
  
  </head>
  <body>
 
 <form action="login.do" method="post">
        <table>
            <tr>
                <td>username</td>
                <td><input id="username" name="username" type="text"></td>
            </tr>
            <tr>
                <td>password
                :</td>
                <td><input id="password" name="password" type="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>

  </body>
</html>


