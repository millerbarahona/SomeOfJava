package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.dto.UsuarioDTO;

public class LoginCTO extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        Facade objF = new Facade();
        switch (accion) {
            case "validaLogin":
                String usuario = request.getParameter("txt_usuario");
                String clave = objF.asegurarClave(request.getParameter("txt_clave"));
                clave = objF.cifrarAES_CBC(clave);
                System.out.println(clave + usuario);
                UsuarioDTO objDTO = new UsuarioDTO();
                objDTO.setCorreo(usuario);
                objDTO.setClave(clave);
                objDTO = objF.valCredenciales(objDTO);
                System.out.println(usuario + clave);
                if (objDTO != null) {
                    System.out.println("Usuario y clave validos");

                    HttpSession objLogin = request.getSession(); //creando la sesion
                    objLogin.setAttribute("login", objDTO);
                    request.getRequestDispatcher("Principal.jsp").forward(request, response);

                } else {
                    System.out.println("Correo o clave no validos");
                    request.getRequestDispatcher("ErrorSesion.jsp").forward(request, response);
                }
                break;
            case "salir":
                HttpSession sesion= request.getSession();
                sesion.invalidate();
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }

    }


// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

