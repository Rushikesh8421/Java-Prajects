// some package
import java.util.Scanner;

public class Stack {
	
	int top = -1, item;
	int max = 5;
	int [] a = new int[max];
	
	Scanner sc = new Scanner(System.in);
	
	public void push() {
		if(top < max-1) {
			System.out.println("Enter the element to be inserted\n");
			item = sc.nextInt();
			a[++top] = item;
		}
		else {
			System.out.println("Stack Overflow!");
		}
	}
	
	public void pop() {
		if(top>-1) {
			item = a[top--];
			System.out.println("The popped item is "+item);
		}
		else {
			System.out.println("Stack Underflow!");
		}
	}
	
	public void display() {
		if(top>-1) {
			System.out.println("The contents of stack are\n");
			for(int i=top; i>-1;i--) {
				System.out.println(a[i]+"\n");
			}
		}
		else {
			System.out.println("Stack is empty!\n");
		}
	}
	
	
	
	
	
	
	
	
	

}

