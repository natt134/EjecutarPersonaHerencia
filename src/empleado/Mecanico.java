
package empleado;

/**
 *
 * @author natal
 */
public class Mecanico extends Empleado {
public int TrabajosRealizados;
public double PrecioDeltrabajo;
public double VlTotaldeTrbjRlz;
public double SueldoQuincenal;

    public void setTrabajosRealizados(int TrabajosRealizados) {
        this.TrabajosRealizados = TrabajosRealizados;
    }

    public void setPrecioDeltrabajo(double PrecioDeltrabajo) {
        this.PrecioDeltrabajo = PrecioDeltrabajo;
    }

    public void setSueldoQuincenal(double SueldoQuincenalMc) {
        this.SueldoQuincenal = SueldoQuincenalMc;
    }
    
    public void CalcularVlTotaldeTrbjRlz (){
    VlTotaldeTrbjRlz=PrecioDeltrabajo*TrabajosRealizados;
    }
    public void CalcularQuincena(){
    SueldoQuincenal=VlTotaldeTrbjRlz*0.04;
    }

    public double getSueldoQuincenal() {
        return SueldoQuincenal;
    }
    
    
    
    
}
