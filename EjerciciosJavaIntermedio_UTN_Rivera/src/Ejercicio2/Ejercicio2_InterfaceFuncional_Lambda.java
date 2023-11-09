
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Ejercicio2_InterfaceFuncional_Lambda {

   public static ArrayList<String> tra(ArrayList<String> lista) {
        
        Transforma t = 
                frases ->
                {
       ArrayList<String> listaPalabrasMay = new ArrayList<>();
        for (String string : lista) {
            listaPalabrasMay.add(string.toUpperCase());
        }
        return listaPalabrasMay;
    }; 
        ArrayList<String> listaMayuscula = t.pasaMayuscula(lista);
       return listaMayuscula;
    }     
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaPalabrasMay = new ArrayList<>();
        lista.add("Hola, ");
        lista.add("Ejercicio");
        lista.add("con");
        lista.add("Metodo");
        lista.add("funcional,");
        lista.add("Ok");
 int cont = 0;
        for (String string : tra(lista)) {
            cont++;
            System.out.println(cont + ": " +string);
        }
    }
    
}
