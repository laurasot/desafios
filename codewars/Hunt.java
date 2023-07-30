//recibo dos parametros, x e y, debo calcular cuantas vueltas da para llegar al punto que se marca en el plano cartesiano
//Tu tarea es calcular el número de vueltas que tuvo que dar para llegar a ese punto
//Simple Fun #288: Turns On Road
// de que depende? 1: de donde este en un principio
//siempre se comienza desde el punto 0,0
// en el bucle, si i es impar, avanza x, si es par, avanza y
public class Hunt {
    public static int turnsOnRoad(int x, int y) {
        int x1 = 0;
        int y1 = 0;
        int i1 = 0;
        if( x == 0 && y == 0){
            return 0;
        }
        for (int i = 0; x1 != x  && x1 <= Math.abs(x)|| y1 != y  && y1 <= Math.abs(y); i++) {
            switch (i % 4) {
                case 0:
                    x1 = Math.abs(x1) + 1;
                    System.out.println("ciclo x" +i+  " : " + x1 + ".0");
                    break;
                case 1:
                    y1 = Math.abs(y1) + 1;
                    System.out.println("ciclo y" +i+  " : 0."  + y1);
                    break;
                case 2:
                    x1 = -x1;
                    System.out.println("ciclo x" +i+  " : " + x1 + ".0");
                    break;
                case 3:
                    y1 = -y1;
                    System.out.println("ciclo y" +i+  " : 0." + y1);
                    break;
                default:
                    break;
            }
            i1 = i;
        }
        if(x == 0 || y == 0){
            i1 = i1 +1;
        }
        System.out.println(i1);
        return i1;
            
    }
}