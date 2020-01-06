package com.bridgelabz.datastructure;


public class StackUsingLinkedList<T> {
	Node<T> head;
	int position = -1;
	Node<T> current;

	private class Node<T> {
		T data;

		Node<T> link;

		public Node<T> next;
	}

	Node<T> top;

	public StackUsingLinkedList() {
		this.top = null;
	}

	@SuppressWarnings("unused")

	public void push(T x) {
		Node<T> temp = new Node<T>();
		if (temp == null) {

			System.out.println(" overflow ");
		}

		temp.data = x;
		temp.link = top;
		top = temp;
		temp.data = top.data;

	}

	 public boolean isEmpty() {
		return top == null;

	}

	 public  T pop() {
		if (top == null) {
			System.out.println("stack is underflow");
			return null;
		} else {
			top = (top).link;

		}
		return (T) top.data;
	}

	public void display() {
		if (top == null) {
			System.out.println("stack is underflow");
		} else {
			Node <T> temp = top;
			while (temp != null) {
				System.out.print(temp.data);

				temp = temp.link;

			}
		}
	}

	public T pop(int location) {

		Node<T> node = head;
		Node<T> node1 = null;
		int pos = 0;
		position--;
		while (pos != location) {
			node1 = node;
			node =node.next;
			pos++;
		}
		if (node == head) {
			head = head.next;
			return node.data;
		} else if (node == current) {
			current = node1;
			node1.next = node.next;
			return node.data;
		} else {
			node.next = node.next;
			return node.data;
		}
	}

	public T popTop() {
		return pop(0);

	}

	public void pushTop(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
			current=head;
		} else {
			current.next=node;
			
			current=current.next;
		}
		position++;

	}

	public static void main(String x[]) {
		StackUsingLinkedList<Integer> li = new StackUsingLinkedList<Integer>();
		li.push(45);
		// li.display();
		li.push(46);
		li.push(47);
		li.push(48);
		li.push(49);
		li.push(50);
		li.display();

		System.out.println("after pop");
		li.pop();
		li.pop();
		li.display();

}
}