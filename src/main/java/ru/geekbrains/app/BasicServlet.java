package ru.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class BasicServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(BasicServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New GET request");

        double x;
        for (int i = 0; i < 10; i++) {
            Product product = new Product(i, "title" + i, x = (double)i * 243 / 5);
            resp.getWriter().printf("<h1>" + product +"</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New POST request");

        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}