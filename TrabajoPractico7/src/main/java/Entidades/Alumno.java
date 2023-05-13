
package Entidades;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Alumno {
    private Integer legajo;
    private String apellido;
    private String nombre;
    private Map<Integer,Materia> materias = new HashMap<>(); 

    public Alumno(Integer legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno() {
    }

    public Integer getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        if(!materias.containsKey(m.getIdMateria())){
            materias.put(m.getIdMateria(),m);
            JOptionPane.showMessageDialog(null, "Alumno inscripto");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede inscribir");
        }
    }
            
    public int cantidadMaterias(){
        return materias.size();
    }
}
