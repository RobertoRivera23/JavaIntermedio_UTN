
package Ejercicio1;

/**
 *
 * @author rober
 */
public class Materia {

    private String nombre;
    private boolean aprobo = true;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getAprobo() {
        return aprobo;
    }

    public void setAprobo(boolean aprobo) {
        this.aprobo = aprobo;
    }
    
    

    @Override
    public String toString() {
        return "Materia:" + "nombre: " + nombre + ", arpobado: "+aprobo;
    }

  
}
