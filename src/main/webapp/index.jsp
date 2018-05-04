<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
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
                <td><input type="reset"  value="注册"></td> 
           </tr>
        </table>
    </form>
</body>
</html>
