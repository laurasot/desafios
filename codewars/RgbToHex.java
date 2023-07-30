import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        List<Integer> nros = new ArrayList<>();
        nros.addAll(Arrays.asList(r,g,b));
        StringBuilder hexadecimalFormat = new StringBuilder();

        for (Integer param : nros) { 
            param = (param < 0) ? 00 : (param > 255) ? 255 : param;
            String hexadecimal = String.format("%02x", param).toUpperCase();
            System.out.println(hexadecimal);
            hexadecimalFormat.append(hexadecimal);  
        }

        return hexadecimalFormat.toString();
    }

    public static String rgbRemaster(int r, int g, int b) {
            int[] array = {r,g,b};
            for (Integer param : array) {
                param = (param < 0) ? 00 : (param > 255) ? 255 : param;
            }
            return (String.format("%02x", r + 
                    String.format("%02x", g + 
                    String.format("%02x", b)).toUpperCase()));
    }
}
