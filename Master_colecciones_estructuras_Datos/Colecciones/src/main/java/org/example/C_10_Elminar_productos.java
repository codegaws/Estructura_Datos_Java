package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C_10_Elminar_productos {
    /*
        Una tienda de ropa ha dejado de vender una serie de productos de cierta marca que tiene bien
        identificados en una lista, sin embargo, en su base de datos siguen apareciendo
        en las busquedas porque no han sido eliminadas. No queremos tener que borrar una por una
        asi que se necesita crear un programa que en base a una lista de marcas, revise
        si esas prendas se encuentran en la base de datos y, si es el caso que se eliminen de la base de datos.
         */
    private static List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));

    public static Producto[] obtenerProductos() {
        Producto[] productos = {
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("H&M", "Verde", "Pay", "32L"),
                new Producto("Zara", "Gris", "Coco", "32L"),
                new Producto("Lacoste", "Verde", "Crown", "32L"),
                new Producto("Farm", "Azul", "Holos", "32L"),
                new Producto("Ho", "Gris", "Pay", "32L"),
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("Lacoste", "Gris", "Pay", "32L"),
        };
        return productos;
    }

    @Data
    @AllArgsConstructor
    @ToString
    static class Producto {
        private String marca;
        private String color;
        private String modelo;
        private String talla;
    }

    private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas) {
        for (ListIterator<Producto> iterador = productos.listIterator(); iterador.hasNext(); ) {
            if (marcas.contains(iterador.next().getMarca())) {
                iterador.remove();
            }
        }
    }

    private static void eliminarMarcasStream(List<Producto> productos, List<String> marcas) {
        productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    }

    public static void main(String[] args) {
        String[] marcas = {"H&M", "Lacoste"};
        productos.forEach(System.out::println);

        //eliminarMarcasIterator(productos, Arrays.asList(marcas));

        eliminarMarcasStream(productos, Arrays.asList(marcas));

        System.out.println("\n\nLista despues de eliminar H&M y Lacoste :");
        productos.forEach(System.out::println);
    }
}
