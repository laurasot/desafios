import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Permutations {
    public static List<String> singlePermutations(String s) {
        Set<String> permutaciones = new HashSet<>();
        permutaciones.add(s);
        StringBuilder palabra = new StringBuilder(s);
        int n = s.length();


        for (int i = 0; i < n - 1; i++) { //achu
            // Cambiar las letras de lugar
            char letra1 = s.charAt(i); 
            palabra.setCharAt(i, palabra.charAt(i+1));
            palabra.setCharAt(i+1, letra1);
            System.out.println(palabra);
            permutaciones.add(palabra.toString());
        }

        return null;
    }
}
