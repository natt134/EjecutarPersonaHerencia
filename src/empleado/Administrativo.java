
package empleado;

/**
 *
 * @author natal
 */
public class Administrativo extends Empleado {

    public double SueldoMensual;
    public double SueldoQuincenal;

    public void setSueldoMensual(double SueldoMensualAd) {
        this.SueldoMensual = SueldoMensualAd;
    }

    public void setSueldoQuincenal(double SueldoQuincenal) {
        this.SueldoQuincenal = SueldoQuincenal;
    }
    
    public void CalcularQuincena () {
    SueldoQuincenal=SueldoMensual/2;
    }

    public double getSueldoQuincenal() {
        return SueldoQuincenal;
    }
    
    
}
