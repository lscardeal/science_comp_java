package dataStructures.stacks;

import dataStructures.lists.LinkedList;

public class Stack<T> {
	
    private LinkedList<T> elements;

    public Stack() {
        this.initialize();
    }   
    
    private void initialize() {
    	this.elements = new LinkedList<>();
    }
    
    public void push(T element) {
        this.elements.addLast(element);
    }

    public T pop() {
    	T element = this.elements.getLast();
        this.elements.removeLast();
        return element;
    }

    public T peek() {
        return this.elements.getLast();
    }

    public boolean isEmpty() {
        return this.elements.getSize() == 0;
    }

    public int size() {
        return this.elements.getSize();
    }
}
