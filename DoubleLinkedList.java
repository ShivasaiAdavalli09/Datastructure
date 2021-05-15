package udemy_datastructures_second;

import udemy_datastructures_second.LinkedList.Node;

//reference from Blue tree code youtube

class DllNode{
	
	
	
	int data;
	DllNode prev;
	DllNode next;
	
	public DllNode(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}

public class DoubleLinkedList {

	DllNode head;
	
	public void addToEnd(int data){
		
		DllNode node=new DllNode(data);
		if(head==null){
			head=node;
		}
		else{
			DllNode curr=head;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=node;
			node.prev=curr;
		}
	}
	
	public void addToStart(int data){
		DllNode node=new DllNode(data);
		if(head==null){
			head=node;
		}
		else{
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	public void addAt(int position,int data){  //reference from alphacodingskills
		
		DllNode newNode = new DllNode(data);
		DllNode temp = new DllNode(data);
	    temp = head;
	    for(int i = 1; i < position-1; i++) {
	      if(temp != null) {
	        temp = temp.next;
	      }
	    }
	 
	    //5. If the previous node is not null, adjust 
	    //   the links
	    if(temp != null) {
	      newNode.next = temp.next;
	      newNode.prev = temp;
	      temp.next = newNode; 
	      if(newNode.next != null)
	          newNode.next.prev = newNode;
	      } 
		
	}
	public void deleteLast(){
		
		DllNode temp=head;
		if(head==null||head.next==null){ //checking for zero elements or one element
			head=null;
			}
		 while(temp.next.next != null)
		        temp = temp.next;
		 DllNode lastNode=temp.next;
	//   last node to null and delete the
	      //   last node
		 temp.next=null;
		 lastNode=null;
	}
	
	public DllNode deleteStart(){
		DllNode toDelete=head;
		if(head==null||head.next==null){ //checking for zero elements or one element
			head=null;
			return toDelete;
		}
		head=head.next;
		head.prev=null;
		return toDelete;
	}
	public void deleteAt(int position){  //reference is alphacodingskills
		
		DllNode temp = head;
	    for(int i = 1; i < position-1; i++) {
	      if(temp != null) {
	        temp = temp.next;
	      }
	    }
	 
	    //4. If the previous node and next of the previous  
	    //   is not null, adjust links 
	    if(temp != null && temp.next != null) {
	    	DllNode nodeToDelete = temp.next;
	      temp.next = temp.next.next; 
	      if(temp.next.next != null)
	        temp.next.next.prev = temp.next;  
	       nodeToDelete = null; 
	    }
		
	}
	public void printList(){
		DllNode node=head;
		
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
		
		
	}
	
	public static void main(String args[]){
		
		DoubleLinkedList dd=new DoubleLinkedList();
		dd.addToStart(10);
		dd.addToStart(20);
		//dd.addAt(2, 30);
		
		dd.addToEnd(50);
		dd.deleteLast();
		dd.addToEnd(60);
		dd.deleteAt(2);
		dd.printList();
		//dd.deleteAt(1);
	}
}
