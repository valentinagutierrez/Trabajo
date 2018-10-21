package manejoVentanasEstudiantes;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafa
 */
public class GestorEstudiante implements Serializable{
    private Estudiante estudiantes[];
    private int numEstudiantes;
    FileWriter archivo;
    
    public Estudiante estudiante; 
    ventanaAgregarEstudiante vAgrEstudiante;
    ventanaListarEstudiantes listarEstudiantes;
    
    public GestorEstudiante(){
        //El vector estudiantes permite crear un max de 20
        estudiantes = new Estudiante[20]; 
        numEstudiantes = 0;
    }
    
    //permite agregar nuevo estudiante
    public void ingresarEstudiante(Estudiante nuevoEstudiante){
        getEstudiantes()[getNumEstudiantes()] = nuevoEstudiante;
        numEstudiantes++;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }
    
       //Metodo para guardar el archivo  
    public void guardarArchivo() {
        try {
             File ruta = new File("c:/ficheros");
             File f = new File(ruta, "datos.txt"); //Creo el archivo y debe tener extension .obj
             ObjectOutputStream output;
            output = new ObjectOutputStream(new FileOutputStream(f));
            output.writeObject(getEstudiantes());
            output.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar archivo" + e, "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }

    //metodo para leer el archivo de la angenda
    public void leerArchivo() {
      try{
            File ruta = new File("c:/ficheros");
            File f = new File(ruta, "datos.txt"); //Creo el archivo y debe tener extension .obj
            ObjectInputStream input;
            input=new ObjectInputStream(new FileInputStream(f));
            estudiantes=(Estudiante[])input.readObject();
            setNumEstudiantes(nEstudiantes());
            input.close();
        }
        catch (IOException e) {}
        catch (ClassNotFoundException e) {}
    }
    
    public int nEstudiantes(){
        int i;
        for(i=0; i<estudiantes.length; i++){
                try{
                    String cadena=String.valueOf(estudiantes[i].getCedula());
                }
                catch(Exception e){
                    return i;
                }
            }
        return i;
    }
    
    
    
}
