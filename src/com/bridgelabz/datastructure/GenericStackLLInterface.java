package com.bridgelabz.datastructure;

public interface GenericStackLLInterface<E> {
	
	void push( E v);
	void pop();
	E peek() throws Exception;
	boolean isEmpty();
	int size();
	void display();

}
