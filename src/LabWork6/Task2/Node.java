package LabWork6.Task2;

public class Node<E> {
    E data;
    Node<E> next = null;

    public Node() {

    }

    public Node(E data) {
        this.data = data;
    }
}