
package Modelo;

/**
 *
 * @author palom
 */
public class EmpleadoAsalariado extends Empleado  {
   
private double salarioSemanal;

public EmpleadoAsalariado  (String nombre,String apellido, String nss, 
        double salario ){
    
    super (nombre, apellido, nss);
    establecerSalarioSemanal (salario);
}
public void establecerSalarioSemanal (double salario){
    if (salario >= 0.0)
        salarioSemanal=salario;
    else 
        throw new IllegalArgumentException (
        "El salario semenal deber ser >= 0.0");
}
public double obtenerSalarioSemanal (){
    return salarioSemanal;
}
@Override 
public double ingresos (){
    return obtenerSalarioSemanal();
}
@Override 
public String toString (){
    return String.format("empelado asalariado:%s/n%s:$%,.2f",
            super.toString(),"salario semanal", obtenerSalarioSemanal()); 
}
}


