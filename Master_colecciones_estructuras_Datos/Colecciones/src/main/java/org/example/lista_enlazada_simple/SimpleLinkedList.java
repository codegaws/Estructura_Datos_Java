package org.example.lista_enlazada_simple;

public class SimpleLinkedList {
    private Node first;// referencia al primer nodo de la lista enlazada

    public SimpleLinkedList() {
        this.first = null;
    }

    public void push(Object obj) {
        //Este nuevo nodo sera la cabeza de la lista enlazada simple
        Node newNode = new Node(obj);
        // ahora el nuevo nodo creado es el primero(apunta primero a first y luego es el nuevo first)
        newNode.setNext(this.first);
        this.first = newNode;
    }

    public Node pop() {
        Node temp = this.first;//guarda referencia al primer nodo en la variable temp
        this.first = this.first.next();

        return temp;
    }

    public Node delete(Object val) {
        Node currentNode = this.first;
        Node previusNode = this.first;

        while (!currentNode.value().equals(val)) {
            if (currentNode.next() == null) {
                return null;
            } else {
                previusNode = currentNode;
                currentNode = currentNode.next();
            }
        }
        if (currentNode == this.first) {
            this.first = this.first.next();
        } else {
            previusNode.setNext(currentNode.next());
        }
        return currentNode;
    }

