package com.practice.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "first-servlet", urlPatterns = "/")
public class FirstServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(FirstServlet.class);
    Map<String, String> userAgentAndIP = new HashMap<>();

    @Override
    public void init() {
        log.info("Sample Servlet initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter responseBody = resp.getWriter();

        resp.setContentType("text/html");

        userAgentAndIP.put(req.getHeader("user-agent"), req.getRemoteAddr());

        for(Map.Entry<String, String> entry : userAgentAndIP.entrySet()){
            if(req.getRemoteAddr().equals(entry.getValue())){
                responseBody.println("<h3 align=\"center\"> <b>" + entry.getValue() + " :: " + entry.getKey() + "</b> </h3>");
            } else {
                responseBody.println("<h3 align=\"center\"> " + entry.getValue() + " :: " + entry.getKey() + " </h3>");
            }
        }
    }

    @Override
    public void destroy() {
        log.info("Sample Servlet destroyed");
    }
}




