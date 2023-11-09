
package Ejercicio1;

/**
 *
 * @author rober
 */
public class Ejericio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan", "Perez", 12345678);
        Materia mat = new Materia(Materias.ALGORITMOS + ""); //1
        Materia mat1 = new Materia(Materias.DISEÑO_DE_SISTEMAS + ""); //3
        Materia mat2 = new Materia(Materias.ESTRUCTURA_DE_DATOS + ""); 
        Materia mat3 = new Materia(Materias.PARADIGMAS_PROGRAMACION + ""); //2
        a1.setMateria(mat);

        a1.setMateria(mat1);
        a1.setMateria(mat2);
        a1.setMateria(mat3);

        Inscripcion insc = new Inscripcion(a1, mat2);
        insc.controlMaterias(mat2);
        System.out.println("****************************************************************");
        Inscripcion insc1 = new Inscripcion(a1, mat3);
        insc1.controlMaterias(mat3);
//        Inscripcion insc1 = new Inscripcion(a1, mat2);
//        insc1.controlMaterias(mat2);
//        System.out.println(a1.toString());
//        System.out.println(mat1.toString());
//        System.out.println(insc1.toString());
//   
//      Inscripcion insc2 = new Inscripcion(a1, mat2);
//        insc1.controlMaterias(mat2);
    }
       
}
