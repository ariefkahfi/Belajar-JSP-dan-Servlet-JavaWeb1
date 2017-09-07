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
public class ServletTwo extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();


        writer.write(
                "<html>" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "Hello World , from servlet two<br/>" +
                        "" +
                        "" +
                        "<a href = '/arief/servlet-one' >" +
                        "" +
                        "</a>" +
                        "" +
                        "" +
                        "</html>"
        );

   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
