package stack;

import java.util.*;
public class StackDemo {
	
	int stack[] , tos , MaxSize;
	
	void createStack(int size) {
		
		tos = -1 ;
		MaxSize = size;
		
		stack= new int [MaxSize];
		
	}
	
	void push (int e) {
		
		tos++;
		
		stack[tos]=e;
		
	}
	
	boolean isFull() {
		
		if (tos == MaxSize-1)
			
			return true;
			else 
			return false;
		
	}
	
	int pop() {
		
		int temp = stack[tos];
		tos--;
		return temp;
	}
	
	boolean isEmpty() {
	
		if (tos == -1)
			return true;
		else 
			return false;
	}
	
	int peek() {
	
		return stack[tos];
		
	}
	
	void printStack() {
	
	for(int i = tos ; i>-1; i--)
	{
	
		System.out.println(stack[i]);
	}
	
	}
	
	public static void main(String[] args)
	{
		
		int ch , e=0;
		
		StackDemo obj = new StackDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
	   int s=sc.nextInt();
	   obj.createStack(s);
		
		do
		{	System.out.println(" 1.push\n 2.pop \n 3.peek\n 4.print\n 0.exit\n");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : 
				if(!obj.isFull())
				{	
					System.out.println("enter data:\n");
					e=sc.nextInt();
					obj.push(e);
					System.out.println("Pushed:");
				}
				else 
					System.out.println("stack is full");
					break;
			
			case 2 : 
				if(!obj.isEmpty())
				{
					e=obj.pop();
					System.out.println("Poped: "+e);
				}
				else 
					System.out.println("Stack is Empty");
					break;
			
			case 3:
				if(!obj.isEmpty())
				{
					e=obj.peek();
					System.out.println("peek: "+e);
				}
				else
					System.out.println("Empty");
					break;
			case 4 : 
				if(!obj.isEmpty())
				{
					System.out.println("Stack has: ");
					obj.printStack();
				}
				else
					System.out.println("Stack is empty");
					break;
			case 0:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Enter valid input: ");
			}
			
		}while(ch!=0);
		sc.close();
	}
	

}