import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {  
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        char[] caracteres = str1.toCharArray(); // la palabra almacenada en un array con las letras separadas --> h, o, l,a
        char[] letras = str2.toCharArray();
        StringBuilder palabra = new StringBuilder();
        for (int i = 0; i < letras.length; i++) {
            int index1  = 0;
            while(letras[i] !=  caracteres[index1]){
                index1++;
            }
            palabra.append(caracteres[index1]);            
            System.out.println("palabra dentro del for: "+ palabra);
        }

        if(palabra.length() == letras.length){
            System.out.println("palabra dentro que retorna true:"+palabra);
            return true;
        }else{
            return false;
        }
    }

    public static boolean scramble2(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
    
        for (char ch : str1.toCharArray()) {
            char current = Character.toLowerCase(ch);
            s1.put(current, s1.getOrDefault(current, 0) + 1);
        }
    
        for (char ch : str2.toCharArray()) {
            char current = Character.toLowerCase(ch);
            s2.put(current, s2.getOrDefault(current, 0) + 1);
        }
    
        for (Map.Entry<Character, Integer> entry : s2.entrySet()) {
            try {
                if (entry.getValue() > s1.get(entry.getKey())) {
                    return false;
                }
            } catch (NullPointerException e) {
                return false;
            }
        }
    
        return true;
    }
}





