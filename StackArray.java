package udemy_datastructures_second;

public class StackArray {

	static final int MAX = 100;
	  int top;

	  //assigning MAX size of the stack
	  int stack[] = new int[MAX];

	  StackArray() {
	    top = -1;
	  }

	  // create a method to check whether 
	  // the stack is empty or not  
	  void isEmpty() {
	    if(top == -1) {
	      System.out.println("Stack is empty.");
	    } else {
	      System.out.println("Stack is not empty.");
	    }
	  }

	  //create a method to return size of the stack 
	 public int size() {
		 int k=0;
		  for(int i=0;i<=top;i++){
			 k++; 
		  }
		  System.out.println("the size is"+k);
	     return k;
	  } 

	  //create a method to add new element       
	  public void push(int x){
	    if(top == (MAX - 1)){
	      System.out.println("Stack size limit reached.");
	    } else {
	      stack[++top] = x;
	      System.out.println(x + " is added into the stack.");
	    }
	  }
 
	 public int peek(){
		  
		  System.out.println("the top element"+stack[top]);
		  return stack[top];
	  }
	  //create a method to delete top element       
	  public void pop(){
	    if(top < 0){
	      System.out.println("Stack is empty.");
	    } else {
	      int x = stack[top--];
	      System.out.println(x + " is deleted from the stack.");
	    }
	  }  

	  public void printAll(){
		  for(int i=0;i<=top;i++){
			  System.out.println(stack[i]);
		  }
	  }
	  //create a method to get top element       
	  int topElement() {
	    if(top < 0) {
	      System.out.println("Stack is empty.");
	      return 0;
	    } else {
	      return stack[top];
	    }
	  }
	  public static void main(String args[]){
		StackArray sa=new StackArray();
		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.printAll();
		sa.peek();
		sa.pop();
		sa.size();
		  
	  }
	}
