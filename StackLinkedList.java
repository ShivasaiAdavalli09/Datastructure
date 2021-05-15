package udemy_datastructures_second;

import java.util.LinkedList;
import java.util.ListIterator;

import academy.learnprogramming.linkedstack.Employee;
import udemy_datastructures_second.LinkedList.Node;

public class StackLinkedList {
	private LinkedList<Integer> stack;

    public StackLinkedList() {
        stack = new LinkedList<Integer>();
    }

    public void push(int data) {
        stack.push(data);
    }

    public Integer pop() {
        return stack.pop();
    }

    public Integer peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Integer> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String args[]){
    	StackLinkedList sll=new StackLinkedList();
    	sll.push(10);
    	sll.push(30);
    	sll.push(40);
    	sll.pop();
    }
}
