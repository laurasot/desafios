import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SpiralingBox {
    public static int[][] createBox(int width, int length)
    {
    int[][] arr = new int[length][width];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
            arr[i][j] = 1 + Math.min(Math.min(i,length - i - 1),Math.min(j,width - j - 1));
        }
        }
        return arr;
    }
    public static int multi(int n, int m) {
        int cantPapeles = 0;
        if(n < 0 || m < 0 ){
            System.out.println(cantPapeles);
            return 0;
        }
        cantPapeles = n * m;
        System.out.println(cantPapeles);
        return cantPapeles;
    }

        
   /*  public BigInteger listPosition(String word){
        int largoWorld = word.length();
 
        Stream.generate(() -> generarCadenaAleatoria(word, random))
                .filter(cadena -> !cadena.equals(word)) //por cada ciclo, osea por cada vez que se ejecute el bucle y genere una nueva cadena
                .distinct() // se va a verificar que la cadena  sea diferente a word (la cadena inicial),    
                .limit(2)// se limita la cantidad de cadenas generadas a 2
                .collect(Collectors.toList());
        //String word1 = word;
        return BigInteger.ZERO;
    }*/



    public static String generarCadenaAleatoria(String cadenaInicial) {
        char[] caracteres = cadenaInicial.toCharArray();
        Random random = new Random();
        
        for (int i = 0; i < caracteres.length - 1; i++) { //comienza for,de 0 hasta la logitud de caracteres
            int j = random.nextInt(caracteres.length - 1);// j es un indice que guarda un valor aleatorio entre 0 y la longitud de caracteres
            char temp = caracteres[i]; // guarda 
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        System.out.println( new String(caracteres));
        return new String(caracteres);
    }

}
