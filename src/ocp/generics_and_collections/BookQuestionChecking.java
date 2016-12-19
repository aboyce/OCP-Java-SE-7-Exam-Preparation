package ocp.generics_and_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Dog { int size; public Dog(int s) {size = s;}}

public class BookQuestionChecking {

	public static void main(String[] args) {
		//questionFromBook();
		//anotherQuestionFromTheBook();
		yetAnotherQuestionFromTheBook();
	}

	private static void questionFromBook() {
		// The book was wrong...
		//List<List<Integer>> table = new List<List<Integer>>();
		
		List<List<Integer>> table2 = new ArrayList<List<Integer>>();
		
		// This also does not compile.
		//List<List<Integer>> table3 = new ArrayList<ArrayList<Integer>>();
	}
	
	private static void anotherQuestionFromTheBook() {
		PriorityQueue<String> queue =  new PriorityQueue<String>();
		queue.add("2");
		queue.add("4");
		System.out.print(queue.peek() + " ");
		queue.offer("1");
		queue.add("3");
		queue.remove("1");
		System.out.print(queue.poll() + " ");
		if(queue.remove("2")) {
			System.out.print(queue.poll() + " ");
		}
		System.out.print(queue.poll() + " " + queue.peek());
	}
	
	private static void yetAnotherQuestionFromTheBook() {
		TreeSet<Dog> dogs = new TreeSet<Dog>();
		dogs.add(new Dog(1));
		dogs.add(new Dog(2));
		dogs.add(new Dog(1));
		System.out.println(dogs.size());
	}
}