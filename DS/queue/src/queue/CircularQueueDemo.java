package queue;
import java.util.*;

public class CircularQueueDemo {
	
	int q[], front, rear,MaxSize,count;

	void createCircularQueue(int size) {
		
		front=0;
		rear=-1;
		count=0;
		MaxSize= size;
		q= new int[MaxSize];
	}
	
	void enqueue(int e) {
		
		rear = (rear+1) % MaxSize;
		count++;
		q[rear]=e;
	}
	
	boolean isFull() {
		
		if(count==MaxSize)
			  return true;
		  else
			  return false;
	}
	
	int dequeue() {
		int temp = q[front];
		front=(front+1)%MaxSize;
		count--;
		return temp;
	
	}
	
	boolean isEmpty() {
		
		if (count==0)
			return true;
		else
			return false;
		
	}
	
	void printCircularQueue() {
		
		int c=0; 
		int i=front;
		
		while(c<count)
		{
			System.out.println(q[i]);
			i= (i+1)%MaxSize;
			c++;
		}
	}
	
	public static void main(String[] args) {
		
		int ch , e=0;
		
		CircularQueueDemo obj = new CircularQueueDemo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of Queue");
		int s=sc.nextInt();
		obj.createCircularQueue(s);
		
		do {
			System.out.println(" 1.Enqueue\n 2.Dequeue\n 3.print\n 0.Exit\n");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1: if(!obj.isFull())
						{
							System.out.println("Enter data");
							e=sc.nextInt();
							obj.enqueue(e);
							System.out.println("Data Enqueue"+e);
						}
					else
						System.out.println("Queue is full");
						break;	
						
			case 2:
					if(!obj.isEmpty())
					{
						e=obj.dequeue();
						System.out.println("Queued: "+e);
					}
					else
						System.out.println("Queue is Empty");
						break;
			case 3:
					if(!obj.isEmpty())
					{
						System.out.println("Queue has: ");
						obj.printCircularQueue();
					}
					else
						System.out.println("Queue is Empty");
					break;
			 case 0:
		    	 System.out.println("Exit");
		    	 
		    default: 
		    	System.out.println("Enter valid input Bandhu");
		    	break;
			}
			
			
		}while(ch!=0);		
		sc.close();
	}
}