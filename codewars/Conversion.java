public class Conversion {
    public String solution(int n) {//1990
        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;

        while (n > 0) {
            if (n >= arabicValues[i]) {// si el parametro es mayor o igual al primer elemnto del array arabicvalues (1000)
                romanNumeral.append(romanSymbols[i]);
                n -= arabicValues[i]; // n = 990
            } else {
                i++;
            }
        }

        return romanNumeral.toString();
    }
}
