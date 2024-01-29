/**
 * 
 */
package mystack;

/**
 * @author Kirankumar Vasala
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) {
			System.out.println("Stack is empty");
			return null;
		}
		
		T poppedValue = theStack.val;
		theStack = theStack.next;
		return poppedValue;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, theStack);
		theStack = newNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<>();
		// Push 1 and 2
		intStack.push(1);
		intStack.push(2);
		
		// Pop
		System.out.println("Popped value: " + intStack.pop());
		
		// Push 5
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
		
		// Push a person p1 with your name
		Person p1 = new Person("Your Name");
		
		// Push a person p2 with my name
		Person p2 = new Person("My Name");
		personStack.push(p1);
		personStack.push(p2);
	}
	private static class Person {
		private String name;
		
		public Person(String name) {
			this.name = name;
		}
		public String toString() {
			return "Person: " + name;
		}
	}

}
