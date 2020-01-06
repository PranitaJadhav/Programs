package com.bridgelabz.datastructure;


public class QueueLinkedListUtility<T> {
	LinkedListUtility<T> queue=new LinkedListUtility<T>();
	public void enqueue1(T j) {
		queue.add(j);
		
	}
	public void display() {
		queue.display();
		
	}
	public T dequeue() {
		 return queue.pop(0);
		
		
	}
	public void enqueue(WeekDay weekDay) {
		// TODO Auto-generated method stub
		
	}

}