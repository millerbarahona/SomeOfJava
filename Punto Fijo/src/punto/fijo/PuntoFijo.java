
package punto.fijo;
import org.nfunk.jep.JEP;

public class PuntoFijo {    
    
    double xi, xo, xr=0, error ,f_xr, f_xi, f_xo;
    String funcion;

    public PuntoFijo(double xi, double xo, String funcion) {
        this.xi = xi;
        this.xo = xo;
        this.funcion = funcion;
    }

    public PuntoFijo() {
    }
    
    public double evaluar (String funcion, double x){
        JEP jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addComplex();
        jep.addVariable("x", x);
        jep.parseExpression(funcion);
        double resultado = jep.getValue();
        boolean error = jep.hasError();
        return resultado;
    }
    
    public PuntoFijo metodo (PuntoFijo reali){
        reali.setF_xi(this.evaluar(reali.getFuncion(), reali.getXi()));        
        reali.setF_xo(this.evaluar(reali.getFuncion(), reali.getXo()));
        reali.setXr((reali.getXi()+reali.getXo())/2);
        reali.setF_xr(this.evaluar(reali.getFuncion(), reali.getXr()));
        
        
       
        return reali;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    public double getF_xr() {
        return f_xr;
    }

    public void setF_xr(double f_xr) {
        this.f_xr = f_xr;
    }

    public double getF_xi() {
        return f_xi;
    }

    public void setF_xi(double f_xi) {
        this.f_xi = f_xi;
    }

    public double getF_xo() {
        return f_xo;
    }

    public void setF_xo(double f_xo) {
        this.f_xo = f_xo;
    }
    
    
}
