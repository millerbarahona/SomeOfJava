package Todo;

public class Gauss_Seidel {

    double[] soluciones;
    double[] vect;
    double itera, error;
    double[][] valores;

    public Gauss_Seidel() {
    }

    public Gauss_Seidel(double[] soluciones, double[] vect, double itera, double[][] valores, double error) {
        this.soluciones = soluciones;
        this.vect = vect;
        this.itera = itera;
        this.valores = valores;
        this.error = error;
    }

    public double[] gaussSeidel(String p) {
        double[] solu = {};
        double xn, yn, zn, wn,tn;
        Vista ob = new Vista();
        String estado = (String) ob.getjComboBox2().getSelectedItem();
        if (p.equals("2")) {
            xn = (this.vect[0] - (valores[0][1] * soluciones[1])) / valores[0][0];
            yn = (this.vect[1] - (valores[1][0] * xn)) / valores[1][1];
            error = Math.abs(((soluciones[0] - xn) / soluciones[0]) * 100);
            double[] solu1 = {xn, yn, error};
            solu = solu1;
            soluciones = solu;
        }
        if (p.equals("3")) {
            xn = (this.vect[0] - (valores[0][1] * soluciones[1]) - (valores[0][2] * soluciones[2])) / valores[0][0];
            yn = (this.vect[1] - (valores[1][0] * xn) - (valores[1][2] * soluciones[2])) / valores[1][1];
            zn = (this.vect[2] - (valores[2][0] * xn) - (valores[2][1] * yn) ) / valores[2][2];
            error = Math.abs(((soluciones[0] - xn) / soluciones[0]) * 100);
            double[] solu1 = {xn, yn, zn, error};
            solu = solu1;
            soluciones = solu;
        }
        if (p.equals("4")) {
            xn = (this.vect[0] - (valores[0][1] * soluciones[1]) - (valores[0][2] * soluciones[2]) - (valores[0][3]) * soluciones[3]) / valores[0][0];
            yn = (this.vect[1] - (valores[1][0] * xn) - (valores[1][2] * soluciones[2]) - (valores[1][3]) * soluciones[3]) / valores[1][1];
            zn = (this.vect[2] - (valores[2][0] * xn) - (valores[2][1] * yn) - (valores[2][3]) * soluciones[3]) / valores[2][2];
            wn = (this.vect[3] - (valores[3][0] * xn) - (valores[3][1] * yn) - (valores[3][2]) * zn) / valores[3][3];
            error = Math.abs(((soluciones[0] - xn) / soluciones[0]) * 100);
            double[] solu1 = {xn, yn, zn, wn, error};
            solu = solu1;
            soluciones = solu;
        }
        if (p.equals("5")) {
            xn = (this.vect[0] - (valores[0][1] * soluciones[1]) - (valores[0][2] * soluciones[2]) - (valores[0][3]) * soluciones[3]-(valores[0][4] * soluciones[4])) / valores[0][0];
            yn = (this.vect[1] - (valores[1][0] * xn) - (valores[1][2] * soluciones[2]) - (valores[1][3] * soluciones[3])-(valores[1][4] * soluciones[4])) / valores[1][1];
            zn = (this.vect[2] - (valores[2][0] * xn) - (valores[2][1] * yn) - (valores[2][3] * soluciones[3])-(valores[2][4] * soluciones[4])) / valores[2][2];
            wn = (this.vect[3] - (valores[3][0] * xn) - (valores[3][1] * yn) - (valores[3][2] * zn)-(valores[3][4] * soluciones[4])) / valores[3][3];
            tn = (this.vect[4] - (valores[3][0] * xn) - (valores[3][1] * yn) - (valores[3][2] * zn)-(valores[3][4] * wn ))/ valores[4][4];
            error = Math.abs(((soluciones[0] - xn) / soluciones[0]) * 100);
            double[] solu1 = {xn, yn, zn, wn, tn,error};
            solu = solu1;
            soluciones = solu;
        }
        return solu;
    }

}
