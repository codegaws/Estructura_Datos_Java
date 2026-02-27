package org.example;

import java.util.LinkedList;

public class c_11_Ejemplo_Lista_Enlazada_LinkedList {
    public static void main(String[] args) {
        // LinkedList es perfecta para implementar colas
        LinkedList<String> colaJugadores = new LinkedList<>();

        System.out.println("=== Sistema de Cola de Jugadores ===\n");

        // Jugadores llegan y se forman (agregar al final)
        colaJugadores.offer("Jugador1");
        colaJugadores.offer("Jugador2");
        colaJugadores.offer("Jugador3");
        colaJugadores.offer("Jugador4");

        System.out.println("Cola inicial: " + colaJugadores);
        // [Jugador1, Jugador2, Jugador3, Jugador4]

        // Un jugador VIP llega (agregar al inicio)
        colaJugadores.offerFirst("JugadorVIP");
        System.out.println("Después de VIP: " + colaJugadores);
        // [JugadorVIP, Jugador1, Jugador2, Jugador3, Jugador4]

        // Atender jugadores (remover del inicio)
        System.out.println("\n--- Atendiendo jugadores ---");
        while (!colaJugadores.isEmpty()) {
            String atendido = colaJugadores.poll();
            System.out.println("Atendiendo: " + atendido);
            System.out.println("Quedan: " + colaJugadores);
        }
    }
}
