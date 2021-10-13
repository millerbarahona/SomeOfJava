
package controlador;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import modelo.dao.ProductoDAO;
import modelo.dao.UsuarioDAO;
import modelo.dto.ProductoDTO;
import modelo.dto.UsuarioDTO;


public class Facade {
    private String ClavePriv="123qAasddGGp7FsA";
    private String VecInicial="U539DqedpjBf49Bf";
 
    public boolean crearProducto (ProductoDTO objP){
        boolean rta= false;
        if(objP!=null){
            ProductoDAO dao = new ProductoDAO();
            rta=dao.create(objP);
        }
        return rta;
    }
    
    public List<ProductoDTO> listarP(){
        List<ProductoDTO> list= null;
        ProductoDAO dao= new ProductoDAO();
        list= dao.getProdcudtos();
        return list;
    }
    
    public ProductoDTO verProducto(ProductoDTO item){
        ProductoDTO objDTO;
        ProductoDAO objDAO = new ProductoDAO();
        objDTO=objDAO.read(item);
        return objDTO;
    }
    public boolean actualizarP (ProductoDTO objP){
        boolean rta= false;
        if(objP!=null){
            ProductoDAO dao= new ProductoDAO();
            rta=dao.update(objP);
        }
        return rta;
    }
    public boolean eliminarP (ProductoDTO objP){
        boolean rta=false;
        if(objP!=null){
            ProductoDAO dao= new ProductoDAO();
            rta=dao.deleteP(objP);
        }
        return rta;
    }
    public boolean crearUsuario (UsuarioDTO objU){
        boolean rta= false;
        if(objU!=null){
            UsuarioDAO dao = new UsuarioDAO();
            rta=dao.create(objU);
        }
        return rta;
    }
    
    public List<UsuarioDTO> listarU(){
        List<UsuarioDTO> list= null;
        UsuarioDAO dao= new UsuarioDAO();
        list= dao.getUsuarios();
        return list;
    }
    
    public UsuarioDTO verUsuario(UsuarioDTO item){
        UsuarioDTO objDTO;
        UsuarioDAO objDAO = new UsuarioDAO();
        objDTO=objDAO.read(item);
        return objDTO;
    }
    public boolean actualizarU (UsuarioDTO objP){
        boolean rta= false;
        if(objP!=null){
            UsuarioDAO dao= new UsuarioDAO();
            rta=dao.update(objP);
        }
        return rta;
    }
    public boolean eliminarU (UsuarioDTO objP){
        boolean rta=false;
        if(objP!=null){
            UsuarioDAO dao= new UsuarioDAO();
            rta=dao.deleteU(objP);
        }
        return rta;
    }
    public UsuarioDTO valCredenciales (UsuarioDTO filter){
        UsuarioDAO objDAO= new UsuarioDAO();
        UsuarioDTO objDTO;
        return objDTO=objDAO.login(filter);        
    }
    public String asegurarClave (String clave){
        try{
            MessageDigest sha256= MessageDigest.getInstance("SHA-512");
            System.out.println("clave en bytes sin cifrar" + clave);
            
            //sha256.update(clave.getBytes("UTF-8"));
            //System.out.println("Clave en bytes cifrada" + sha256.digest());
            
            //clave= String.format("%064x", new BigInteger(1,sha256.digest()));
            //System.out.println("clave biginteger " + clave);
            //System.out.println("longitud "+ clave.length());
            
            clave = Base64.getEncoder().encodeToString(sha256.digest());
            System.out.println("clave string b64 "+ clave);
            System.out.println("longitud "+ clave.length());
        }catch(Exception ex){
            System.out.println("Error al encriptar");
        }
        return clave;
    }
    
    public String cifrarAES_CBC (String clave){
        String textoCifrado = "";
        Cipher objAES;
        try {
            objAES = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec KeyIni = new SecretKeySpec(this.ClavePriv.getBytes("UTF-8"), "AES");
            IvParameterSpec ivp = new IvParameterSpec(this.VecInicial.getBytes("UTF-8"));
            //incializar el obj chiper objAES en modo cifrado
            objAES.init(Cipher.ENCRYPT_MODE, KeyIni,ivp);
            byte[] byteCifrado = objAES.doFinal(clave.getBytes("UTF-8"));
            textoCifrado = Base64.getEncoder().encodeToString(byteCifrado);
            System.out.println("Cifrado AES: "+ textoCifrado);
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAlgorithmParameterException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Facade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return textoCifrado;
    }
            
}
