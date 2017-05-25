package com.devcolibri.servlet;

import com.devcolibri.bean.UserBean;
import com.devcolibri.entity.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class MainServlet extends HttpServlet{

    @EJB
    private UserBean userBean;
/**
 * Documentation for me (lolkekcheburek)
 * run asadmin.bat as administrator
 * http://localhost:8080/EJBGlassfishJPA-1.0/add
 * asadmin> start-domain domain1
 * http://localhost:4848/common/index.jsf
 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }
}
