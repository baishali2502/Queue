package com.bridgelabz.queue;
import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Operations:\n1.Enqueue\n"
				+ "2.Dequeue\n"
				+ "3.Front\n"
				+ "4.Rear\n"
				+ "5.Size of queue\n"
				+ "6.IsEmpty\n"
				+ "7.Print queue\n"
				+  "Choose : ");
		
		
		//creating a queue 
		queue<Integer> q = new queue<>();
		
		
		int choice = s.nextInt();
		while(choice!=-1)
		{
			if(choice==1)
			{
				System.out.print("Enter element :");
				int elem = s.nextInt();
				q.enqueue(elem);
				System.out.println("Element added(at rear end)\n");
			}
			else if(choice==2)
			{
				 int poped =q.dequeue();
				 System.out.println("Removed element(from front end) = "+poped+"\n");
			}
			else if(choice==3)
			{
				int f = q.front();
				System.out.println("Element at front = "+f+"\n");
			}
			else if(choice==4)
			{
				int r = q.rear();
				System.out.println("Element at rear = "+r+"\n");
			}
			else if(choice==5)
			{
				int n = q.size();
				System.out.println("Size of queue = "+n+"\n");
			}
			else if(choice==6)
			{
				boolean isE = q.isEmpty();
				if(isE)
					System.out.println("Queue Empty\n");
				else
					System.out.println("Queue Not Empty\n");
			}
			else
			{
				q.printQueue();
			}
			
			System.out.print("Enter choice : ");
			choice = s.nextInt();
		}
	}

}
