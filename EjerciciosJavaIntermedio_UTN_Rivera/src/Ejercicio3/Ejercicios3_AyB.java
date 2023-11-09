package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Stream.concat;

/**
 *
 * @author rober
 */
public class Ejercicios3_AyB {

    public static void main(String[] args) {
                                                                                                                //Ejercicio A
/* Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
lista con los strings en mayúscula. */
                                                                                                                
        List<String> lista1 = new ArrayList<>();
        lista1.add("Esto");
        lista1.add("devuelve");
        lista1.add("lista");
        lista1.add("en");
        lista1.add("Mayusculas");

        System.out.println("Lista en mayusuculas");

        //Fomra 1
                System.out.println("**************************Forma 1*******************************");
        List<String> listaMayuscula = lista1.stream()
                .map(palabra -> palabra.toUpperCase())
                .collect(Collectors.toList());

        for (String string : listaMayuscula) {
            System.out.println(string);
        }

        //Forma 2
        System.out.println("**************************Forma 2*******************************");
        List<String> lista2 = new ArrayList<>();
                lista1.forEach(palabra1 -> {
            String palabra2 = palabra1.toUpperCase();
            lista2.add(palabra2);
            System.out.println(palabra2);
        }
        );
                
                                                                                    //EJERCICIO B
/* Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
método debe devolver un String que concatene separando por coma y espacio todas las
palabras, en la lista, que tengan más de "n" caracteres. */
 
        
        //Fomra 1
                System.out.println("**************************Forma 1*******************************");
        System.out.println(listaConcatenados(lista1, 3));
               
        //Forma 2
        System.out.println("**************************Forma 2*******************************");
        System.out.println(otraListaConcatenada(lista1, 4));
    }
    
 public static String listaConcatenados(List<String> listaSinConcatenar, int numero){
     String concatenado = listaSinConcatenar.stream()
             .filter(palabra-> palabra.length() > numero).collect(Collectors.joining(", ") );
     return concatenado ;
 }
 
 public static String otraListaConcatenada(List<String> otraLista, int num){
     String pal= "";
     int cont = 0;
     for (String string : otraLista) {
       if(string.length() > num)
          pal= pal +", "+ string; 
       cont++;
         System.out.println("cont:" + cont);
        }
     return pal ;
 }
}
 