import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Write Number in Expanded Form codewars
public class Kata {
    public static String expandedForm(int num){
        String num2= String.valueOf(num);
        int cantidadNum = num2.length();
        String cantidadCeros = "";
        List<StringBuilder> hola = new ArrayList<>();
        StringBuilder ultimo = new StringBuilder();
        for (int i = cantidadNum - 1; i >= 0; i--) {
            StringBuilder centena = new StringBuilder();
            
            centena.append( num2.charAt(i) + cantidadCeros);
            hola.add(centena);
            cantidadCeros= cantidadCeros.concat("0");  
        }
        Collections.reverse(hola);
        if(hola.size() > 1){
            for (int i = 0; i < hola.size(); i++) {
                StringBuilder bu = hola.get(i);
                boolean contieneCeros = bu.toString().matches("^0+$"); // Verificar si bu no solo contiene ceros
                if (!contieneCeros) {
                    ultimo.append(bu);
                    //System.out.println(hola.size() -1);
                    if (i < hola.size() -1) {
                        ultimo.append(" + ");
                    }
                }
            }
                if(  ultimo.charAt( ultimo.length() - 4) == '0'){
                    ultimo.delete(ultimo.length() - 3, ultimo.length());    
                }
            System.out.println(ultimo.toString());    
            return ultimo.toString();
        }
        else{
            System.out.println(hola.get(0).toString());
            return hola.get(0).toString();
        }     
    }

    public static String expandedForm2(int num){
        String outs = "";
        for (int i = 10; i < num; i *= 10) { //bucle  comienza del 10, se ejecuta si num es mayor a 10, por cada ciclo i se multiplica por 10
            int rem = num % i; //se calcula el resto: ej 356/10 =35.6
            outs = (rem > 0) ? " + " + rem + outs : outs; //usando el operador ternario, si 6 > 0  se agrega " + " 6 + outs
            num -= rem; // se resta el 6 a num
        }
        outs = num + outs;
        System.out.println(outs);
        return outs;

    }

}