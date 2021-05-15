package udemy_datastructures_second;

//reference is https://algorithms.tutorialhorizon.com/circular-linked-list-complete-implementation/

class Node{
	
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
	}
}

public class CircularLinkedList {
	
	public int size=0;
	public Node head=null;
	public Node tail=null;
	
	//add node at start
	public void addAtStart(int data){
		
		Node newnode=new Node(data);
		if(size==0){  //we can also keep head==null but because we are using head and tail so use size
			head=newnode;
			tail=newnode;
			newnode.next=head;
		}
		else{
			Node temp=head;
			newnode.next=temp;
			head=newnode;
			tail.next=newnode;
		}
		size++;
	}

	public void addNodeAtEnd(int data){
		
		//if adding first time and using this can use condition size==0 and if true call addAtStart(data)
		
		Node newnode=new Node(data);
		tail.next=newnode;
		tail=newnode;
		tail.next=head;
		size++;
	}
	
	public void deleteNodeFromStart(){
		
		head=head.next;
		tail.next=head;
		size--;
		
	}
	
	public int elementAt(int index){
		Node newnode=head;
		while(index-1!=0){
			newnode=newnode.next;
			index--;
		}
		return newnode.data;
	}
	
	public int getSize(){
		return size;
	}
	
	public void print(){
		Node temp=head;
		System.out.println("the elements are");
//		while(temp!=head){
//			temp=temp.next;
//			System.out.println(temp.data);
//		}
		 do {
             System.out.print(" " + temp.data); //because when we give while loop we declare temp=data and giving again temp!=data it throws issuehence using do while both are same
             
             temp = temp.next;
         }
         while(temp!=head);
			
		}
	public static void main(String args[]){
		
		CircularLinkedList cll=new CircularLinkedList();
		cll.addAtStart(10);
		cll.addAtStart(5);
		cll.addNodeAtEnd(30);
		cll.deleteNodeFromStart();
		cll.print();
	}
	}
