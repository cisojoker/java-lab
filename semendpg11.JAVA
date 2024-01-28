index.html
<html>
<head><title>anything</title></head>
<body>
<form action="http://localhost:8080/projectname/check" method="get">
<fieldset style="width:20%;background-color:yellow">
<table>
<tr><td>name:</td><td><input type="text" name="name"></td></tr>
<tr><td>age:</td><td><input type="text" name="age"></td></tr>
<tr><td></td><td><input type="submit" value ="check eligibility"></td></tr>
</table>
</fieldset>
</form>
</body>
</html>

Main.java
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Main extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        if(age>=18){
            pw.println("<font color='green' size='4'>welcome "+name+"to this site</font>");
        }else{
            pw.println("<font color='red' size='4'>hello "+name+"you are not authorised</font>");
        }
        pw.println("<br><br><a href='index.html'>back</a>");
        pw.close();
    }
}

web.xml
<web-app>
<servlet>
<servlet-name>abc</servlet-name>
<servlet-class>java class ka name(Main)</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>abc</servlet-name>
<url-pattern>/check</url-pattern>
</servlet-mapping>
</web-app>
