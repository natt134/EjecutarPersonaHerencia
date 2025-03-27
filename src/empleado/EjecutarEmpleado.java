
package empleado;

import java.util.Scanner;


public class EjecutarEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer=new Scanner (System.in);
    String nombre, Departamento,Cargo,son;
    double SueldoMensual, preciodeltrabajo,precioauto,salariominimo;
    int trabajosrealizados,autosvendidos;
        System.out.println("\n CALCULA EL SUELDO QUINCENAL DE LOS EMPLEADOS\n");
        Empleado []Empleado=new Empleado [3];
        for (int i = 0; i < Empleado.length; i++) {
            System.out.println("<<<<    Datos Ingresados de la persona "+(i+1));
        System.out.println("<<<<    Tipos de Empleados    >>>>");  
            System.out.println("<<<< ------------- ---------- >>>>"); 
            System.out.println("        1. Administrativo         ");
            System.out.println("        2. Mecanico         ");
            System.out.println("        3. Vendedor         ");
            System.out.println("<<<<    ¿Cual es su Tipo?          >>>>");
            int tipo=Leer.nextInt();
            System.out.println("");
            System.out.println("\n------ Lectura de Datos ----------\n");
            System.out.print("Ingrese su nombre: ");
            nombre=Leer.next();
            System.out.print("Ingrese su departamento: ");
            Departamento=Leer.next();
            System.out.print("Ingrese su cargo: ");
            Cargo=Leer.next();
            if (tipo==1) {
            Administrativo Admin=new Administrativo ();
            System.out.print("Teclee el sueldo mensual:");
            SueldoMensual=Leer.nextDouble();
            
            Admin.setNombre(nombre);
            Admin.setDepartamento(Departamento);
            Admin.setCargo(Cargo);
            Admin.setSueldoMensual(SueldoMensual);
            Admin.setSueldoQuincenal(SueldoMensual);
            
            Admin.CalcularQuincena();
            
            System.out.println(" ");
            System.out.println("Administrador@ " + Admin.getNombre());
            System.out.println("Su sueldo quincenal es de: "+ Admin.getSueldoQuincenal());  
        }
                 if (tipo==2) {
                Mecanico Meca=new Mecanico ();
                System.out.print("Teclee cuantos trabajos realizó en esta quincena");
                trabajosrealizados=Leer.nextInt();  
                System.out.println("Cual es el valor de cada trabajo?");
                preciodeltrabajo=Leer.nextDouble();
                
                Meca.setNombre(nombre);
                Meca.setDepartamento(Departamento);
                Meca.setCargo(Cargo);
                Meca.setTrabajosRealizados(trabajosrealizados);
                Meca.setPrecioDeltrabajo(preciodeltrabajo);
                
                Meca.CalcularVlTotaldeTrbjRlz();
                Meca.CalcularQuincena();
                
                System.out.println(" ");
                System.out.println("Mecanic@ " + Meca.getNombre());
                System.out.println("Su sueldo quincenal es de: "+ Meca.getSueldoQuincenal());
                }
                 if (tipo==3) {
                 Vendedor Ventas=new Vendedor ();
                System.out.print("Teclee cuantos autos vendió ");
                autosvendidos=Leer.nextInt();  
                System.out.print("Cual es el valor de cada auto ");
                precioauto=Leer.nextDouble();
                System.out.print("Cual es el salario minimo que maneja: ");
                salariominimo=Leer.nextDouble();
                
                Ventas.setNombre(nombre);
                Ventas.setDepartamento(Departamento);
                Ventas.setCargo(Cargo);
                Ventas.setCantidadAutos(autosvendidos);
                Ventas.setPrecioAuto(precioauto);
                Ventas.setSalarioMinimo(salariominimo);
                
                Ventas.CalcularVentaRealizada();
                Ventas.CalcularQuincena();
                
                System.out.println(" ");
                System.out.println("Vendedor@ " + Ventas.getNombre());
                System.out.println("Su sueldo quincenal es de: "+ Ventas.getSueldoQuincenal());                
        }    
        }         
    }   
}
