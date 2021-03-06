package ru.jobj.dream.servlet;

import ru.jobj.dream.model.Candidate;
import ru.jobj.dream.store.Store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostServletCandidate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Store.instOf().save(new Candidate(Integer.valueOf(req.getParameter("id")), req.getParameter("name")));
        resp.sendRedirect(req.getContextPath() + "candidate.jsp");
    }
}
