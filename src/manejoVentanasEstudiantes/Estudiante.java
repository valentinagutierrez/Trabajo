package manejoVentanasEstudiantes;

import java.io.Serializable;

/**En esta clase nos encargamos de poner los atributos que tiene el estudiante
 *
 * @author Rafa
 */
public class Estudiante implements Serializable{
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private int nota1;
    private int nota2;
    private int nota3;
    private double promedio = 1;
    private String estado=null;
    
    public Estudiante(String cedula, String nombre, String apellido, int edad, int nota1, int nota2, int nota3, float promedio, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
    public static void main(String[] args) {
       ventanaPrincipal venPrincipal = new ventanaPrincipal();
       venPrincipal.setVisible(true);
    }
}
