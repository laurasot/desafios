public class Max {
    // sino contiene solo numeros negativos, significa que solo contiene positivos?
    public static int sequence(int[] arr) {
        if(arr.length == 0) return 0;
        boolean containsOnlyNegatives = true;

        int maxSum = arr[0]; // Inicializamos la suma máxima con el primer elemento del arreglo
        int currentSum = arr[0]; // Suma acumulativa del subarreglo actual
        for (int i = 1; i < arr.length; i++) {
            // Calculamos la suma acumulativa del subarreglo actual
            currentSum = Math.max(arr[i], currentSum + arr[i]);//La función Math.max(a, b) devuelve el valor máximo entre a y b.
            // Actualizamos la suma máxima si es necesario
            maxSum = Math.max(maxSum, currentSum);
            if(arr[i] >= 0 ||arr[0] >= 0)containsOnlyNegatives = false; // si es false este if ya no debe funcionar
        }
        if(containsOnlyNegatives) return 0;
        return maxSum;
    }
}
