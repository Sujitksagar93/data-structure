package queue;
import java.util.*;

public class PriorityQueue {
	
	int q[], front , rear , MaxSize;
	
	
	void createQueue(int size) {
		
		front=0;
		rear=-1;
		MaxSize= size;
		
		q= new int [MaxSize]; 
		
	}
	
	void enqueue(int e)
	{
		rear ++;
		q[rear]= e;	
		
		for(int i=front;i<rear;i++ )
		{
			for(int j=front;j<rear;j++) {
				
				if(q[j]< q[j+1])
				{
					int t=q[j];
					q[j] = q[j+1];
					q[j+1]=t;
					
				}
			}
		}
	}
	
	boolean isFull(){
		 
		if(rear==MaxSize-1)
			return true;
		else  
			return false;
	} 
	
	int dequeue(){
		
		int temp = q[front];
		front ++;
		return temp;
	}
	
	boolean isEmpty(){
			
		if(front>rear)
			return true;
		else
			return false;	
	}
	
	void printQueue(){
		
		for(int i=front;i<=rear;i++)
		{
			System.out.println(q[i]);
		}
	}
		
		public static void main(String[] args)
		{
			int ch , e=0;
			
			PriorityQueue obj = new PriorityQueue();
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enetr the Size of Queue");
			
			int s=sc.nextInt();
			obj.createQueue(s);
			
			do {
				System.out.println(" 1.Enqueue\n 2.Dequeue\n 3.Print\n 0.Exit\n");
				ch=sc.nextInt();
				
				switch(ch) {
				
				case 1: 
					if(!obj.isFull())
					{
						System.out.println("Enetr data");
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
						System.err.println("Dequeued: "+e);
					}
					else 
						System.out.println("Queue is empty:");
						break;
				case 3: 
					if(!obj.isEmpty())
					{
						System.out.println("Queue has: ");
						obj.printQueue();
					}
					else
						System.out.println("Queue is Empty");
					
			     		break;
			 
				}	
			}while(ch!=0);
			
			sc.close();
				
			}
}
