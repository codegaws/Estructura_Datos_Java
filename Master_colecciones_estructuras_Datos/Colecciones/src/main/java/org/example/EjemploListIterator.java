import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>(Arrays.asList("Rojo", "Verde", "Azul"));
        ListIterator<String> iterador = colores.listIterator();
        System.out.println("Posición inicial del iterador: antes del índice 0");
        while (iterador.hasNext()) {
            int indexAntes = iterador.nextIndex();
            String color = iterador.next();
            int indexDespues = iterador.nextIndex();
            System.out.println("Antes de next(): índice = " + indexAntes + ", después de next(): índice = " + indexDespues + ", valor = " + color);
        }
    }
}

