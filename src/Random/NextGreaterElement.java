package Random;

import java.util.Stack;

public class NextGreaterElement {
	
	public static void nextGreaterElement(int arr[]) {
		//Stack declaration
		Stack<Integer> st = new Stack<>();
		//Traverse an array 
		for (int i = 0; i < arr.length; i++) {
			//Initially stack is empty, 
			//push first element of an array in a stack
			if (st.isEmpty()) {
				st.push(arr[i]);
			} else {
				/*
				if stack is not empty 
				and the array element is greater than the stack top value
				*/
				while (!st.isEmpty() && st.peek() < arr[i]) {
					System.out.println("next greater element of " + st.peek() + " is " + arr[i]);
					st.pop();
				}
				st.push(arr[i]);
			}
		}
		
		while(!st.empty()) {
			System.out.println("next greater element of " + st.peek() + " is " + null);
			st.pop();
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 2, 6, 8, 1 };
		nextGreaterElement(arr);
	}
}
