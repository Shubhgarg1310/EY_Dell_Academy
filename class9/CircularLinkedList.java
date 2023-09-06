package com.class9;

public class CircularLinkedList {
	static class Node{
		int data;
		Node next;
		Node(){
			
		}
		Node(int data){
			this.data = data;
		}
	}
	private Node head, tail;
	
	CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtFirst(int data) {
		//check if the list is empty
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode; //both head and tail will point to same node
			tail = newNode;
			newNode.next = head;
		}
		else {
			Node temp = head;  //store data in temporary node
			newNode.next = temp; //new node will point to temp as next node
			head = newNode;//new node will be the head node
			//since it is circuler linkedlist, tail will point to head
			tail.next = head;
		}
				
	}
	
	public void insertAtLast(int data) {
		//check if the list is empty
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode; //both head and tail will point to same node
			tail = newNode;
			newNode.next = head;
		}
		else {
			//tail will point to new node
			tail.next = newNode;
			//new node will point to temp as next node
			tail = newNode;
			//since it is circuler linkedlist, tail will point to head
			tail.next = head;
		}
				
	}
	
	public void insertAtPerticular(int data, int position) {
		//check if the list is empty
		Node temp, newNode;
		int i, count;
		newNode = new Node();
		temp = head;
		count = size();
		if(temp==null || size() < position) {
			System.out.println("Index is greater than size of the list");
		}
		else {
			 	newNode.data = data;
			    for(i=1;i<position -1;i++) {
			    	temp = temp.next;
			    }
			    newNode.next = temp.next;
			    temp.next = newNode;
		}
				
	}
	
	public int size() {
		int size = 1;
		if(head != null) {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
				size++;
			}
		}
		return size;
	}
	
	public void display() {
		Node temp = head;
		if(head != null) {
			do {
				System.out.printf("%d\n", temp.data);
				temp = temp.next;
			}
			while(temp != head);
		}
		System.out.println("\n");
	}
	
	public void deleteNode(int data) {
		if(head == null) {
			System.out.println("List is empty");
		}
		
		Node currentNode = head;
		Node previousNode = new Node();
		while(currentNode.data != data) {
			if(currentNode.next == head) {
				System.out.println("Given node with data " + data + "is not found in circular LL");
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
		if(currentNode == head&& currentNode.next == head) {
			head = null;
		}
		
		if(currentNode == head) {
			previousNode = head;
			while(previousNode.next == head) {
				previousNode = previousNode.next;
			}
			head = currentNode.next;
			previousNode.next = head;
		}
		
		else if(currentNode.next == head) {
			previousNode.next = head;
		}
		else {
			previousNode.next = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		obj.insertAtFirst(10);
		obj.insertAtFirst(20);
		obj.insertAtFirst(30);
		obj.insertAtLast(40);
		obj.insertAtPerticular(5, 3);
		obj.deleteNode(20);
		obj.display();
		System.out.println("Size - " + obj.size());
	}
}
