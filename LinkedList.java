package udemy_datastructures_second;


//reference is from telusko
class LinkedList {
	  Node head;

	  // Create a node
	  class Node {
	    int data;
	    Node next;
}

	public void insert(int data){
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) //condition for first element being inserted 
		{
			head=node;
		}
		else{
			Node new_node=head;
			//now traversing to find last element and inserting value there
			while(new_node.next!=null){
				new_node=new_node.next;
			}
			new_node.next=node;  //after getting last element we are assigning that next which no longer shud be null to node we created
		  //as we can see by default node we created next is null therefore the element inserted at last next is null 
		}
	}
	  
	public void insertStart(int data){
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		node.next=head; //before assign head=node we assign whatever value at head to node
		head=node;//now this node becomes head i.e as we know always assigns to left <--
	}
	
	public void insertAt(int index,int data){
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		Node new_node=head;
		for(int i=0;i<index-1;i++)  //we traverse using for loop to reach till index-1(because starts from 0) and go next and next till reach and make changes there
		{
			new_node=new_node.next;
		}
		node.next=new_node.next; //assigning the position next to node next because the reference to next elements should not impact
		new_node.next=node;//telling that new_node next element is node now therefore now next to newnode is node
	}
	public void deleteAt(int index){
		if(index==0){
			head=head.next;
		}
		else{
			Node node=head;
			Node n1=null;
			for(int i=0;i<index-1;i++){
				node=node.next;
			}
			n1=node.next;//because i want to refer the node.next to some reference node which is null
		   node.next=n1.next;//now  assigning the next to value of next i.e null
		}
	}
	public void show(){
		
		Node node=head;
		
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	

public static void main(String args[]){
	
	LinkedList ll=new LinkedList();
	ll.insert(20);
	ll.insert(30);
	ll.insertAt(1, 40);
	ll.insertStart(10);
	ll.deleteAt(2);
	ll.show();
}
}