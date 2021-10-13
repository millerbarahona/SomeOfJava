/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javafx.scene.AccessibleAttribute;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dto.ProductoDTO;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "UsuarioCTO", urlPatterns = {"/UsuarioCTO"})
public class UsuarioCTO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equalsIgnoreCase("Usuario")) {
            Facade objF = new Facade();
            switch (accion) {
                case ("Listar"):
                    List<UsuarioDTO> list = objF.listarU();
                    request.setAttribute("lista_usuarios", list);
                    break;
                case "Agregar":
                    String nombre1 = request.getParameter("txt_nombre1");
                    String nombre2 = request.getParameter("txt_nombre2");
                    String apellido1 = request.getParameter("txt_apellido1");
                    String apellido2 = request.getParameter("txt_apellido2");
                    String cedu = request.getParameter("txt_n_iden");
                    String correo = request.getParameter("txt_correo");
                    String clave = objF.asegurarClave(request.getParameter("txt_clave"));
                    clave = objF.cifrarAES_CBC(clave);
                    String sexo = request.getParameter("txt_sexo");
                    Date fecha_nac = Date.valueOf(request.getParameter("txt_fecha"));
                    String estado = request.getParameter("txt_estado");
                    UsuarioDTO nuevo = new UsuarioDTO(nombre1, nombre2, apellido1, apellido2, cedu, correo, clave, sexo, fecha_nac, estado);
                    System.out.println(nuevo.toString());
                    objF.crearUsuario(nuevo);
                    request.getRequestDispatcher("UsuarioCTO?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    UsuarioDTO edit = new UsuarioDTO(Integer.parseInt(request.getParameter("id")));
                    System.out.println("editar");
                    edit = objF.verUsuario(edit);
                    System.out.println(edit.toString());
                    request.setAttribute("usuario", edit);
                    request.getRequestDispatcher("UsuarioCTO?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":                    
                    System.out.println("actualizar");
                    int id1 = Integer.parseInt(request.getParameter("txt_id"));
                    String nombre11 = request.getParameter("txt_nombre1");
                    String nombre22 = request.getParameter("txt_nombre2");
                    String apellido11 = request.getParameter("txt_apellido1");
                    String apellido22 = request.getParameter("txt_apellido2");
                    String cedu1 = request.getParameter("txt_n_iden");
                    String correo1 = request.getParameter("txt_correo");
                    String clave1 = objF.asegurarClave(request.getParameter("txt_clave"));
                    clave1 = objF.cifrarAES_CBC(clave1);
                    String sexo1 = request.getParameter("txt_sexo");
                    
                    Date fecha_nac1 = Date.valueOf(request.getParameter("txt_fecha"));
                    String estado1 = request.getParameter("txt_estado");
                    UsuarioDTO actual= new UsuarioDTO(id1,nombre11,nombre22,apellido11,apellido22,cedu1,correo1,clave1,sexo1,fecha_nac1,estado1);
                    objF.actualizarU(actual);
                    System.out.println("actualizar");
                    request.getRequestDispatcher("UsuarioCTO?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    UsuarioDTO elimi = new UsuarioDTO();
                    elimi.setId(Integer.parseInt(request.getParameter("id")));
                    objF.eliminarU(elimi);
                    request.getRequestDispatcher("UsuarioCTO?menu=Usuario&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("UsuarioVTA.jsp").forward(request, response);
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
