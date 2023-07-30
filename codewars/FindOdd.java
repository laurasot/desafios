import java.util.HashSet;
import java.util.Set;
import static java.util.Arrays.stream;

public class FindOdd {
    public static int findIt(int[] a) { // 1,2,2
        int odd = 0;
        //Map<Integer, Integer> frequencyMap = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int num : a) {

            if (!set.add(num)){
                odd = num;
            }
        }

        /*
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // se agrega al mapa el numero con su respectiva frecuencia
            // utilizando el metodo.getOrDefault(num, 0) si no hay mas repeticiones por defecto es 0, luego se le suma 1, por la iteracion reciente
        }
         */
        
        return odd;
    }


    
    public class FindOdd1 {
        public static int findIt(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
        }
    }
        /*
        Se define la clase FindOdd1 y el método findIt que toma como argumento un array de enteros (int[] arr).
        Arrays.stream(arr) convierte el array en un Stream de elementos enteros.
        .reduce(0, (x, y) -> x ^ y) 
        aplica la operación XOR a todos los elementos del Stream.
        0 es el valor inicial o identidad para la operación XOR.
        (x, y) -> x ^ y es la función lambda que se aplica a cada par de elementos para realizar la operación XOR. x es el acumulador y y es el elemento actual.

        La operación reduce combina todos los elementos del Stream aplicando la función proporcionada. 
        En este caso, la operación XOR se realiza entre cada par de elementos, comenzando desde cero como valor inicial. 
        El resultado final es el elemento que ocurre un número impar de veces en el array, 
        ya que los elementos que se repiten un número par de veces se "cancelan" entre sí y su contribución al resultado final es 0.
        
         */
        


        public class FindOdd2 {
            public static int findIt(int[] A) {
            int odd = 0;
            
            for (int i : A) {
              odd ^= i;
            }
          
            return odd;
          }
        }
}
