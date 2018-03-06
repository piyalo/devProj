// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Hello.java

package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public final class Hello extends HttpServlet
{

    public Hello()
    {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Sample Application Servlet Page</title>");
        writer.println("</head>");
        writer.println("<body bgcolor=white>");
        writer.println("<table border=\"0\">");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("<img src=\"images/tomcat.gif\">");
        writer.println("</td>");
        writer.println("<td>");
        writer.println("<h1>Sample Application Servlet</h1>");
        writer.println("This is the output of a servlet that is part of");
        writer.println("the Hello, World application.");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
