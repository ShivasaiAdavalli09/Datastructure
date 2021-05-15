package SortandSearching;

import java.util.Scanner;

public class LinearSearch {
	
	
	public static void main(String args[])
	{
	int arr[],key,n;
	System.out.println("enter the number of elements in the array");
	
	
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	System.out.println("eneter the elements into array");
	arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
	System.out.println("enter the search element");
	key=in.nextInt();
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]==key)
			System.out.println(key+"element found at"+(i+1));
		
		else if(arr[i]!=key)
			System.out.println("element not found");}
	
	}

}
