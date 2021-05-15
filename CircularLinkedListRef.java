package udemy_datastructures_second;


//reference is blue tree code


 public class CircularLinkedListRef {

	Node last;
	class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	 CircularLinkedListRef(Node last){
		this.last=last;
		if(this.last!=null){
			this.last.next=last;
		}
	 }
	
	 public void addToEnd(int data){
		 Node newnode=new Node(data);
		 
		 if(last==null){
			 newnode.next=newnode;
		 }
		 else{
			 newnode.next=last.next;
			 last.next=newnode;
		 }
		 last=newnode;
	 }
	 public void addToStart(int data){
		 Node newnode=new Node(data);
		 if(last==null){
			 newnode.next=newnode;
			 last=newnode;
		 }
		 else{
			 newnode.next=last.next;
			 last.next=newnode;
		 }
	 }
}
