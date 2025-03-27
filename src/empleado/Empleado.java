/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author natal
 */
abstract  class Empleado {
protected String nombre;
protected String Departamento;
protected String Cargo;

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setNombre(String nombreem) {
        this.nombre = nombreem;
    }

    public void setDepartamento(String Departamentoem) {
        this.Departamento = Departamentoem;
    }

    public void setCargo(String Cargoem) {
        this.Cargo = Cargoem;
    }
    abstract void CalcularQuincena ();   
}
