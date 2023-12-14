package com.bridgelabz.queue;

//@desc:Defining Node of a linked-list

public class Node<T> 
{
	T data;
	Node<T> next;
	Node(T data,Node<T> next){
		this.data = data;
		this.next = next;
	}
	Node(T data){
		this.data = data;
		next = null;
	}
}
