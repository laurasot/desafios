//Su tarea es escribir una función que tome una cadena y devuelva una nueva cadena con todas las vocales eliminadas.
// Complete la función que acepta un parámetro de cadena e invierte cada palabra de la cadena. Deben conservarse todos los espacios en la cadena.
import java.util.List;

public class Troll {
    public static String disemvowel(String str) {
        CharSequence cadena1 = new StringBuilder(str); //  crea un nuevo objeto StringBuilder llamado cadena1 y lo inicializa con una cadena existente str
        String sinVocales = str.replaceAll("[aeiouAEIOU]", "");
        
        return "sinVocales";
    }

    public static String reverseWords(final String original){
        if (original.matches("\\s*")) {
            return original;
        }
        String[] palabras = original.split(" ");
        StringBuilder reversa = new StringBuilder();

        for (String palabra : palabras) {
            StringBuilder palabraRevertida = new StringBuilder(palabra).reverse();
            reversa.append(palabraRevertida).append(" ");
        }
        return reversa.toString().trim();
    }
}
