
package Entidades;

public class Materia {
    private Integer idMateria;
    private String nombre;
    private Integer anio;

    public Materia(Integer idMateria, String nombre, Integer anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public Materia() {
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
