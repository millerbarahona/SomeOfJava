package modelo.dto;

import java.io.Serializable;
import java.util.Objects;

public class ProductoDTO implements Serializable{

    private int id_p;
    private String nombre_p;
    private String descripcion_p;
    private int unidades_p;
    private int valor_p;

    public ProductoDTO(int id_p, String nombre_p, String descripcion_p, int unidades_p, int valor_p) {
        this.id_p = id_p;
        this.nombre_p = nombre_p;
        this.descripcion_p = descripcion_p;
        this.unidades_p = unidades_p;
        this.valor_p = valor_p;
    }

    public ProductoDTO(String nombre_p, String descripcion_p, int unidades_p, int valor_p) {
        this.nombre_p = nombre_p;
        this.descripcion_p = descripcion_p;
        this.unidades_p = unidades_p;
        this.valor_p = valor_p;
    }

    public ProductoDTO(int id_p) {
        this.id_p = id_p;
    }
    
    

    public ProductoDTO() {
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getDescripcion_p() {
        return descripcion_p;
    }

    public void setDescripcion_p(String descripcion_p) {
        this.descripcion_p = descripcion_p;
    }

    public int getUnidades_p() {
        return unidades_p;
    }

    public void setUnidades_p(int unidades_p) {
        this.unidades_p = unidades_p;
    }

    public int getValor_p() {
        return valor_p;
    }

    public void setValor_p(int valor_p) {
        this.valor_p = valor_p;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Producto: " + "id=" + id_p + ", nombre=" + nombre_p + ", descripcion=" + descripcion_p + ", unidades=" + unidades_p + ", valor=" + valor_p ;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.id_p != other.id_p) {
            return false;
        }
        if (this.unidades_p != other.unidades_p) {
            return false;
        }
        if (this.valor_p != other.valor_p) {
            return false;
        }
        if (!Objects.equals(this.nombre_p, other.nombre_p)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_p, other.descripcion_p)) {
            return false;
        }
        return true;
    }
    
    
}
