package com.bridgelabz.queue;
import java.util.*;



//@desc:Implement queue using linked-list

public class queue<T>
{
	Node<T> front = null;
	Node<T> rear = null;
	int size = 0;
	
//-------------------------------------- UC-1 ---------------------------------------
	
	/*
     * @desc:This method adds an element in the queue
     * @param:Element to be added
     * @return:void
    */
    void enqueue(T elem)
    {
    	Node<T> newnode = new Node<T>(elem);
    	if(front==null)
    	{
    		front = newnode;
    		rear = newnode;
    	}
    	else
    	{
    		rear.next = newnode;
    		rear = newnode;
    	}
    	size++;
    }
    
    
	/*
     * @desc:This method returns size of queue
     * @param:none
     * @return:int-->size of linked-list
    */
    int size()
    {
    	return size;
    }
    /*
     * @desc:This method checks if queue is empty or not
     * @param:none
     * @return:boolean
    */
    boolean isEmpty()
    {
    	return (size==0);
    }
    /*
     * @desc:This method returns front element of queue
     * @param:none
     * @return:Front element
    */
    T front()
    {
    	if(front==null)
    		return null;
    	return front.data;
    }
    /*
     * @desc:This method returns rear element of queue
     * @param:none
     * @return:Rear element
    */
    T rear()
    {
    	if(rear==null)
    		return null;
    	return rear.data;
    }
    /*
     * @desc:This method prints the queue
     * @param:none
     * @return:void
    */
    void printQueue()
    {
    	System.out.print("Front--> ");
    	Node<T> temp = front;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    		temp = temp.next;
    	}
    	System.out.println("<--Rear");
    }
    
}
