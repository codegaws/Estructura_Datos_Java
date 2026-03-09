package org.example.lista_enlazada_simple;

public class Node {
    private Object data;
    private Node next;

    public Node(Object dato) {
        this.data = dato;
    }

    public Object value() {
        return this.data;
    }

    public Node next() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void showContent() {
        System.out.println("Value " + data);
    }
}
