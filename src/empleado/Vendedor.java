/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado ;

/**
 *
 * @author natal
 */
public class Vendedor extends Empleado {

public int CantidadAutos;
public double PrecioAuto;
public double SalarioMinimo;
public double ValorDeVenta;
public double SueldoQuincenal;

    public void setCantidadAutos(int CantidadAutos) {
        this.CantidadAutos = CantidadAutos;
    }

    public void setPrecioAuto(double PrecioAuto) {
        this.PrecioAuto = PrecioAuto;
    }

    public void setSalarioMinimo(double SalarioMinimo) {
        this.SalarioMinimo = SalarioMinimo;
    }

    public void setSueldoQuincenal(double SueldoQuincenalVd) {
        this.SueldoQuincenal = SueldoQuincenalVd;
    }

   public void CalcularVentaRealizada (){
   ValorDeVenta= PrecioAuto*CantidadAutos;
   }
   
   public void CalcularQuincena() {
   SueldoQuincenal=(SalarioMinimo/2+(ValorDeVenta*0.02));
   }

    public double getSueldoQuincenal() {
        return SueldoQuincenal;
    } 
}
