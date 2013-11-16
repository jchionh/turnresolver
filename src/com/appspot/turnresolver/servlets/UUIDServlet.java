package com.appspot.turnresolver.servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UUIDServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        
        UUID uuid = UUID.randomUUID();
        
        resp.setContentType("text/plain");
        resp.getWriter().println(uuid.toString());
    }
}
