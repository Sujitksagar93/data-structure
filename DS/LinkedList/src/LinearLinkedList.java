
class Node{
	
	int data;
	Node next;


Node(int data){
	
	this.data=data;
	next=null;
}
}
public class LinearLinkedList {

		Node root;
		
	void createLinkedList(){
		
		 root=null;
	}
	
	void insertLeft(int data) {
		
		Node n=new Node(data);
		
		if (root==null)
		{
			root = n;
		}
		else
		{
			n.next=root;
			root=n;
		}
	}	
	void deleteLeft() {
			
		if(root==null) {
			System.out.println("list is empty");
		}
		else
		{
			Node t= root;
			root.next=root;
			System.out.println("deleted: " +t.data);
		}
	
	}	
	
	void insertRight(int data) {
		
		Node n = new Node(data);
		if(root  == null) {
			root=n;
		}
		else
		{	Node t=root;
			while(t.next!=null) {
				
				t=t.next;
				                                                                    
			}
			t.next=n;
		}
	}
	
	void deleteRight() {
		
		if(root==null) {
			System.out.println("List is Empty");
		}
		else
		{
			Node t,t2;
			t=t2=root;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			t2.next=null;
			System.out.println("deleted:"+t.data);
		}
	}
	
	void printList() {
		
		if(root==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node t;
			t=root;
			while(t!=null)
			{
				System.out.println("the data:"+t.data);
				t=t.next; 
			}
		}
	}
	
	void countNodes() {
		
		if (root==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node t;
			t=root;
			int c=0;
			while(t!=null)
			{
				t=t.next;
				c++;
			}
			System.out.println("total nodes in list :"+c);
		}
	}
	
	void searchNodeAt(int key) {
		
		if(root==null)
		{
			System.out.println("List is Empty"); 
			
		}
		else
		{
			Node t;
			t=root;
			int c=0;
			
			while(t!=null && t.data!=key)
			{
				t=t.next;
				c++;
			}
			
			if(t!=null)
			{
				System.out.println(" found at"+c+"from root");
			}
			else
			{
				System.out.println(" not found");
			}
		}
	}
	
	void deleteKeyBase(int key) {
		
		if(root==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			Node t,t2;
			t2=t=root;
			while(t!=null && t.data!=key)
			{
				t2=t;
				t=t.next;
			}
			if(t!=null) {
				System.out.println("Not found");
			}
			else
			{
				if(t==root)
				{
					root=root.next;
				}
				else if(t.next==null)
				{
					t2.next=null;
				}
				else
				{
					t2.next=t.next;
				}
				System.out.println("Delete:"+t.data);
				
			}
			
		
		}
	}
	
	void insertAt(int key,int data) {
		
		if(root==null)
		{
			System.out.println("LIst is Empty");
		}
		else
		{
			Node t;
		    t=root;
		    while(t!=null && t.data!=key)
		    {
		    	t=t.next;
		    }
		    if(t==null)
		    {
		    	System.out.println("Not found");
		    }
		    else
		    {
		    	Node n=new Node(data);
		    	n.next=t.next;
		    	t.next=n;
		    }
		}
	}
}
