package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C_09_Metodos_de_Iteracion {
    public static void main(String[] args) {
        //creacion de ArrayList
        List<String> listaColores = new ArrayList<>();

        //adicion de elemento individuales
        listaColores.add("Rojo");
        listaColores.add("Amarillo");
        listaColores.add("Azul");

        //Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);

        //adicion de elementos de otra coleccion
        elementos.addAll(listaColores);

        //Iteracion a travez del ArrayList
        ListIterator<String> iterador = listaColores.listIterator();
        System.out.println("Recorrido con iterador :");
        while (iterador.hasNext()) {
            System.out.println("Color:" + iterador.next());
        }

        System.out.println("\n\nRecorrido inverso con iterador :");
        while (iterador.hasPrevious()) {
            System.out.println("Color:" + iterador.previous());
        }

        while (iterador.hasNext()) {
            if (iterador.next().equals("Amarillo")) {
                iterador.remove();
            }
        }
       /* System.out.println("\n\nLista despues de eliminar Amarillo :");
        while (iterador.hasNext()) {
            System.out.println("Color:" + iterador.next());
        }*/ //-> esto no va a funcionar por que en el primer hasNext se va a eliminar el elemento y el iterador se va a quedar en la posicion del elemento eliminado, por lo que el siguiente hasNext va a devolver false y no se va a imprimir nada.

        //solucion 1 crear otro objeto iterador
        ListIterator<String> iterador2 = listaColores.listIterator();
        System.out.println("\n\nLista despues de eliminar Amarillo solucion 1:");
        while (iterador2.hasNext()) {
            System.out.println("Color:" + iterador2.next());
        }

        System.out.println("\n\nLista despues de eliminar Amarillo Solucion 2:");
        //solucion 2 crear otro objeto iterador y un for
        for (ListIterator<String> iter = listaColores.listIterator(); iter.hasNext(); ) {
            System.out.println("Color : " + iter.next());
        }
    }
}


