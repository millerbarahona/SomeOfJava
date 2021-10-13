
package controlador;

import java.util.List;
import modelo.dto.ProductoDTO;


public class main {
    public static void main (String[] args){
        Facade objf = new Facade();
        List<ProductoDTO> list=null;
        list= objf.listarP();
        if(list !=null){
            for(ProductoDTO producto :list){
                System.out.println(producto);
            }
        }else{
            System.out.println("no hay productos");
        }
    }
}
