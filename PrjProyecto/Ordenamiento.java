import java.util.ArrayList;

public class Ordenamiento {
    public static void ordenar(ArrayList<Comparable> arreglo) {
        boolean huboIntercambio;
        do {
            huboIntercambio = false;
            for (int i = 0; i < arreglo.size() - 1; i++) {
                Comparable a = arreglo.get(i);
                Comparable b = arreglo.get(i + 1);
                if (b.menorQue(a)) {
                    arreglo.set(i, b);
                    arreglo.set(i + 1, a);
                    huboIntercambio = true;
                }
            }
        } while (huboIntercambio);
    }
}
