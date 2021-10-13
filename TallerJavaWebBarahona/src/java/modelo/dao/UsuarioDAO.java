package modelo.dao;

import conexiones.ConexionMsql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.dto.ProductoDTO;
import modelo.dto.UsuarioDTO;

public class UsuarioDAO {

    private static final String SQL_READ = "select * from tb_usuario where id = ?";
    private static final String SQL_READ_ALL = "select * from tb_usuario";
    private static final String SQL_INSERT = "insert into tb_usuario (nombre1, nombre2, apellido1, apellido2, n_identificacion, correo, clave, sexo, fecha_nac, estado) VALUES(?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "delete from tb_usuario where id = ?";
    private static final String SQL_LOGIN = " select * from tb_usuario where correo=? and clave= ?";
    private static final String SQL_UPDATE = "update tb_usuario set nombre1 = ? , nombre2 = ? , apellido1 = ?, apellido2 = ?, n_identificacion = ?, correo = ?, clave = ?, sexo = ?, fecha_nac = ?, estado = ? where id =? ";
    private static final ConexionMsql cnx = ConexionMsql.getInstance();

    public boolean create(UsuarioDTO nuevo) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, nuevo.getNombre1());
            ps.setString(2, nuevo.getNombre2());
            ps.setString(3, nuevo.getApellido1());
            ps.setString(4, nuevo.getApellido2());
            ps.setString(5, nuevo.getN_identificacion());
            ps.setString(6, nuevo.getCorreo());
            ps.setString(7, nuevo.getClave());
            ps.setString(8, nuevo.getSexo());
            ps.setDate(9, nuevo.getFecha_nac());
            ps.setString(10, nuevo.getEstado());

            if (ps.executeUpdate() > 0) {
                System.out.println("se agrego");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return false;
    }

    public List<UsuarioDTO> getUsuarios() {
        List<UsuarioDTO> listusu = null;
        if (cnx.getConexion() != null) {
            PreparedStatement psmt;
            try {
                psmt = cnx.getConexion().prepareStatement(SQL_READ_ALL);
                ResultSet rs = psmt.executeQuery();
                listusu = new ArrayList<>();
                while (rs.next()) {
                    UsuarioDTO aux = new UsuarioDTO(rs.getInt("id"), rs.getString("nombre1"), rs.getString("nombre2"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("n_identificacion"), rs.getString("correo"), rs.getString("clave"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("estado"));
                    listusu.add(aux);
                }

            } catch (SQLException ex) {
                System.out.println("Error obtener: " + ex.getMessage());
            } finally {
                cnx.cerrarConexion();
            }
        }
        return listusu;
    }

    public boolean deleteU(UsuarioDTO item) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getId());
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

    public boolean update(UsuarioDTO upt) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, upt.getNombre1());
            ps.setString(2, upt.getNombre2());
            ps.setString(3, upt.getApellido1());
            ps.setString(4, upt.getApellido2());
            ps.setString(5, upt.getN_identificacion());
            ps.setString(6, upt.getCorreo());
            ps.setString(7, upt.getClave());
            ps.setString(8, upt.getSexo());
            ps.setDate(9, upt.getFecha_nac());
            ps.setString(10, upt.getEstado());
            ps.setInt(11, upt.getId());

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

    public UsuarioDTO read(UsuarioDTO filter) {
        UsuarioDTO objRes = null;
        PreparedStatement psmt;
        try {
            psmt = cnx.getConexion().prepareStatement(SQL_READ);
            psmt.setInt(1, filter.getId());
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                objRes = new UsuarioDTO(rs.getInt("id"), rs.getString("nombre1"), rs.getString("nombre2"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("n_identificacion"), rs.getString("correo"), rs.getString("clave"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("estado"));
            }
        } catch (SQLException ex) {
            System.out.println("Prudcto no encontrado: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return objRes;
    }
    
    public UsuarioDTO login(UsuarioDTO filter) {
        UsuarioDTO objRes = null;
        PreparedStatement psmt;
        try {
            psmt = cnx.getConexion().prepareStatement(SQL_LOGIN);
            psmt.setString(1, filter.getCorreo());
            psmt.setString(2, filter.getClave());
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                objRes = new UsuarioDTO(rs.getInt("id"), rs.getString("nombre1"), rs.getString("nombre2"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("n_identificacion"), rs.getString("correo"), rs.getString("clave"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("estado"));
            }
        } catch (SQLException ex) {
            System.out.println("Usuario no encontrado: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return objRes;
    }
}
