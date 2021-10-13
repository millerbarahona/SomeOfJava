package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ProductoDAO;
import modelo.dto.ProductoDTO;

@WebServlet(name = "ProductoCTO", urlPatterns = {"/ProductoCTO"})
public class ProductoCTO extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equalsIgnoreCase("Producto")) {
            Facade objF = new Facade();
            switch (accion) {
                case "Listar":
                    List<ProductoDTO> list = objF.listarP();
                    request.setAttribute("lista_productos", list);
                    break;
                case "Agregar":
                    String nombre = request.getParameter("txt_nombre_pro");
                    String des = request.getParameter("txt_descripcion_pro");
                    int und = Integer.parseInt(request.getParameter("txt_unidades_pro"));
                    int valor = Integer.parseInt(request.getParameter("txt_valor_pro"));
                    ProductoDTO nuevo = new ProductoDTO(nombre, des, und, valor);
                    objF.crearProducto(nuevo);
                    request.getRequestDispatcher("ProductoCTO?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ProductoDTO edit = new ProductoDTO();
                    edit.setId_p(Integer.parseInt(request.getParameter("id")));
                    edit = objF.verProducto(edit);
                    request.setAttribute("producto", edit);
                    request.getRequestDispatcher("ProductoCTO?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    int id1= Integer.parseInt(request.getParameter("txt_id_pro"));
                    String nombre1= request.getParameter("txt_nombre_pro");
                    String des1=request.getParameter("txt_descripcion_pro");
                    int unid1= Integer.parseInt(request.getParameter("txt_unidades_pro"));
                    int val1= Integer.parseInt(request.getParameter("txt_valor_pro"));
                    ProductoDTO actual = new ProductoDTO(id1,nombre1,des1,unid1,val1);
                    objF.actualizarP(actual);
                    request.getRequestDispatcher("ProductoCTO?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Eliminar":
                    ProductoDTO elimi= new ProductoDTO ();                    
                    elimi.setId_p(Integer.parseInt(request.getParameter("id")));
                    objF.eliminarP(elimi);
                    request.getRequestDispatcher("ProductoCTO?menu=Producto&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("ProductoVTA.jsp").forward(request, response);
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
