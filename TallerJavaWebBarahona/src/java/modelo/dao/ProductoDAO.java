package modelo.dao;

import conexiones.ConexionMsql;
import controlador.Facade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dto.ProductoDTO;
import modelo.dto.UsuarioDTO;

public class ProductoDAO {

    private static final String SQL_READ = "select * from tb_producto where id_producto = ?";
    private static final String SQL_READ_ALL = "select * from tb_producto";
    private static final String SQL_INSERT = "insert into tb_producto (nombre_producto,valor,unidades,descripcion_producto) VALUES(?,?,?,?)";
    private static final String SQL_DELETE = "delete from tb_producto where id_producto = ?";
    private static final String SQL_UPDATE = "update tb_producto set nombre_producto = ?, valor = ?, unidades= ?, descripcion_producto=? where id_producto =?";
    private static final ConexionMsql cnx = ConexionMsql.getInstance();

    public boolean create(ProductoDTO nuevo) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, nuevo.getNombre_p());
            ps.setInt(2, nuevo.getValor_p());
            ps.setInt(3, nuevo.getUnidades_p());
            ps.setString(4, nuevo.getDescripcion_p());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return false;
    }

    public List<ProductoDTO> getProdcudtos() {
        List<ProductoDTO> listprod = null;
        if (cnx.getConexion() != null) {
            PreparedStatement psmt;
            try {
                psmt = cnx.getConexion().prepareStatement(SQL_READ_ALL);
                ResultSet rs = psmt.executeQuery();
                listprod = new ArrayList<>();
                while (rs.next()) {
                    ProductoDTO aux = new ProductoDTO(rs.getInt("id_producto"), rs.getString("nombre_producto"), rs.getString("descripcion_producto"), rs.getInt("unidades"), rs.getInt("valor"));
                    listprod.add(aux);
                }

            } catch (SQLException ex) {
                System.out.println("Error obtener: " + ex.getMessage());
            } finally {
                cnx.cerrarConexion();
            }
        }
        return listprod;
    }

    public boolean deleteP(ProductoDTO item) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getId_p());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return false;
    }

    public boolean update(ProductoDTO upt) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, upt.getNombre_p());
            ps.setInt(2, upt.getValor_p());
            ps.setInt(3, upt.getUnidades_p());
            ps.setString(4, upt.getDescripcion_p());
            ps.setInt(5, upt.getId_p());

            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return false;
    }

    public ProductoDTO read(ProductoDTO filter) {
        ProductoDTO objRes = null;
        PreparedStatement psmt;
        try {
            psmt = cnx.getConexion().prepareStatement(SQL_READ);
            psmt.setInt(1, filter.getId_p());
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                objRes = new ProductoDTO(rs.getInt("id_producto"), rs.getString("nombre_producto"), rs.getString("descripcion_producto"), rs.getInt("unidades"), rs.getInt("valor"));
            }
        } catch (SQLException ex) {
            System.out.println("Prudcto no encontrado: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return objRes;
    }
}
    
    
        