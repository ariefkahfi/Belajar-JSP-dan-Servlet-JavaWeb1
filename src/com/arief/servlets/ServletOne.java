package com.arief.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arief on 9/7/2017.
 */
public class ServletOne extends HttpServlet {








    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        StringBuilder html = new StringBuilder();

        html.append("<html>");
        html.append("<head>" +
                "" +
                "<title></title>" +
                "" +
                "<style>" +
                "" +
                "a{" +
                "display : block;" +
                "" +
                "}" +
                "" +
                "" +
                "</style>" +
                "</head>");
        html.append("<body>" +
                "" +
                "" +
                "<a href = '/arief/servlet-two'>" +
                "Lihat Servlet dua" +
                "</a>" +
                "" +
                "<a href = '/arief/webPages/hello.jsp'>" +
                "Lihat Hello Jsp Page" +
                "</a>" +
                "" +
                "" +
                "" +
                "</body>");
        html.append("</html>");


        writer.write(html.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }



}
