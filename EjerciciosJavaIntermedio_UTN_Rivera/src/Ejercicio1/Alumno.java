
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rober
 */
public class Alumno {
     private String nombre;
    private String apellido;
    private Integer dni;
    private Materia materia;
    private List<Materia> listaInscripMateria;

    public Alumno() {

    }

    public Alumno(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        listaInscripMateria = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void agregarMateria(Materia mat) {
        listaInscripMateria.add(mat);
    }

    public List<Materia> getListaInscripMateria() {
        return listaInscripMateria;
    }

    public boolean verInscripcion(Materia mat) {
        System.out.println("ver inscripcion");
        boolean inscripto = false;
        for (Materia materia1 : listaInscripMateria) {
            if (materia1.getNombre().equals(mat.getNombre())) {
                inscripto = true;
            }
        }
        return inscripto;
    }

    public boolean aprobado(Materia mat) {
        boolean aprobado = false;
        for (Materia materia1 : listaInscripMateria) {
            if (materia1.getAprobo() == true) {
                aprobado = true;
            }
        }
        return aprobado;
    }

    @Override
    public String toString() {
        return "Alumno:" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", materia=" + materia;
    }
 
}
