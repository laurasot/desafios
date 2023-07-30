public class Solution {
    public static String toCamelCase(String s){
        StringBuilder cadena = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            if(letra == '-' || letra == '_'){
                char letraSusc =s.charAt(i + 1);
                letraSusc = String.valueOf(letraSusc).toUpperCase().charAt(0);
                cadena.setCharAt(i + 1, letraSusc);
            }
        }
        System.out.println(cadena.toString().replaceAll("[-_]", ""));
        return cadena.toString().replaceAll("[-_]", "");
    }
}
