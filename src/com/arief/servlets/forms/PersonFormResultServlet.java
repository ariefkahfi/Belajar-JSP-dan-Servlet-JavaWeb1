package com.arief.servlets.forms;

import com.arief.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arief on 9/7/2017.
 */
public class PersonFormResultServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int id = Integer.parseInt(String.valueOf(req.getParameter("id")));
        String nama = req.getParameter("nama");



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
                "display : block ;" +
                "margin-bottom  : 10px ; " +
                "text-decoration : none ; " +
                "" +
                "}" +
                "" +
                "</style>" +
                "</head>");

        html.append("<body>" +
                "" +
                "<div>" +
                "" +new Person(id,nama).toString()+
                "</div>"+
                "" +
                "<a href= '/arief/webPages/hello.jsp'>" +
                "Back to Hello JSP page" +
                "</a>" +
                "" +
                "<a href = '/arief/index.jsp'>" +
                "Back to Index JSP page" +
                "</a>" +
                "</body>");

        html.append("</html>");


        writer.write(html.toString());


    }

}
