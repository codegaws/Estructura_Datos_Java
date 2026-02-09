package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_08_ArrayList1 {
    public static void main(String[] args) {
        //creacion de ArrayList
        List<String> listaColores = new ArrayList<>();

        //Creacion mediante la clase Arrays
        String[] nombres = {"Arturo", "Daniel", "Javier", "Gustavo", "Pamela"};
        List<String> listaNombres = Arrays.asList(nombres);

        //adicion de elemento individuales
        listaColores.add("Rojo");
        listaColores.add("Verde");
        listaColores.add("Azul");

        //Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);

        //adicion de elementos de otra coleccion
        elementos.addAll(listaColores);

        System.out.println("Lista de nombres :");
        listaNombres.forEach(System.out::println);

        System.out.println("Lista colores :");
        listaColores.forEach(System.out::println);

        System.out.println("Lista elementos :");
        elementos.forEach(System.out::println);

        //Iteracion a travez del ArrayList


    }
}
