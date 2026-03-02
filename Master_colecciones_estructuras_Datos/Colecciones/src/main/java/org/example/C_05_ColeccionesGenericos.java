package org.example;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class C_05_ColeccionesGenericos {
    public static void main(String[] args) {
        Collection<Persona> names = new ArrayList<>();
        //names.add("george"); esta mal
        names.add(new Persona("George"));
        Queue<String> name2 = new LinkedList<>();//lista enlazada, cola sencilla, FIFO, no se puede acceder a un elemento específico, solo al primero o al último
    }

    @Data
    @AllArgsConstructor
    static class Persona {
        private String name;
    }
}