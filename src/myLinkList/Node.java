package myLinkList;

import java.util.LinkedList;

public  class Node<E> {

    E item;
    Node<E> next;
    Node <E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
    Node( E element) {
        this.item = element;


    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                '}';
//    }
}
