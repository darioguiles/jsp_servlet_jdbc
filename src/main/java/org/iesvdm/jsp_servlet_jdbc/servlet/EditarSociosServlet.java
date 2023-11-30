package org.iesvdm.jsp_servlet_jdbc.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.iesvdm.jsp_servlet_jdbc.dao.SocioDAOImpl;
import org.iesvdm.jsp_servlet_jdbc.model.Socio;

import java.io.IOException;
import java.util.Optional;

public class EditarSociosServlet extends HttpServlet {

    SocioDAOImpl socioDAO;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean valida = true;
        int socioID =-1;
        try {
            socioID = Integer.parseInt(request.getParameter("socioID"));
        }
        catch (Exception e){
            e.printStackTrace();
            valida=false;
        }

        if (valida){

            Optional<Socio> optionalSocio = this.socioDAO.find(socioID);


            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/formularioSocio.jsp");


        }
        else {
            response.sendRedirect("/");
        }


    }





}
