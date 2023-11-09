
package Ejercicio1;

/**
 *
 * @author rober
 */
public class Inscripcion {
     private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void inscribirMateria(Materia materia) {
        int cont = 0;
           if (alumno.verInscripcion(materia) == false) {
            alumno.agregarMateria(materia);
            cont++;
        }
           if(cont != 0){
        System.out.println("Se inscribio correctamente a: " + materia.getNombre());
           } else {
        System.out.println("No se pudo inscribir a la: " + materia.getNombre());
           }
    }

    public void controlMaterias(Materia materia) {
        System.out.println("control materias");
        if (materia.getNombre().equals(Materias.ESTRUCTURA_DE_DATOS+"")) {
            System.out.println("1");
            inscribirMateria(materia);
        } else if (materia.getNombre().equals(Materias.ALGORITMOS+"")) {
            System.out.println("2");
            inscribirMateria(materia);
        } else if (materia.getNombre().equals(Materias.PARADIGMAS_PROGRAMACION+"")) {
            System.out.println("3");
            for (Materia mat : alumno.getListaInscripMateria()) {
                if (mat.getNombre().equals(Materias.ALGORITMOS) && alumno.aprobado(mat) == true) {
                    inscribirMateria(materia);
                    System.out.println("3.1");
                    break;
                } else {
                    System.out.println("El alumno aun no aprobo: " + Materias.ALGORITMOS+"");
                    break;
                }
            }
        } else if (materia.getNombre().equals(Materias.DISEÑO_DE_SISTEMAS+"")) {
            System.out.println("4");
            for (Materia mat : alumno.getListaInscripMateria()) {
                if (mat.getNombre().equals(Materias.PARADIGMAS_PROGRAMACION) && alumno.aprobado(mat) == true) {
                    System.out.println("4.1");
                    inscribirMateria(materia);
                    break;
                } else {
                    System.out.println("El alumno aun no aporbo: "+ Materias.PARADIGMAS_PROGRAMACION);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Inscripcion" + "alumno=" + alumno + ", materia=" + materia;
    }
 
}
