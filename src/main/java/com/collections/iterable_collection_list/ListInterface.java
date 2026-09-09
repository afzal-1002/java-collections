package com.collections.iterable_collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class ListInterface {
	
	// 1. Using ArrayList (Dynamic array - best for fast random access)
	List<Integer> list = new ArrayList<>();

	// 2. Using LinkedList (Doubly-linked list - best for frequent insertions/deletions)
	List<Integer> linkedList = new LinkedList<>();

	// 3. Using Vector (Synchronized dynamic array)
	List<Integer> vectorList = new Vector<>();

	// 4. Using Stack ()
	List<Integer> stack = new Stack<>();


	public void ListOperations() {
        // Fix: Pass Arrays.asList to the ArrayList constructor to make it mutable
        list = new ArrayList<>(Arrays.asList(4, 2, 1, 3, 6, 5, 9, 7, 8));
        
        list.add(100);
		list.remove(0);

		list.set(0, 200);


		System.out.println( "indexOf = " + list.indexOf(5));
		System.out.println("get() = " + list.get(0));
		System.out.println("contains() = " + list.contains(5));
		System.out.println("size() = " + list.size());
		System.out.println("isEmpty() = " + list.isEmpty());
		System.out.println("addAll() = " + list.addAll(0, new ArrayList<>(Arrays.asList(4,5,6,8))));
        System.out.println(  "after addAll() "+ list); 
		System.out.println(list.contains(2));

		list.clear();

		  System.out.println( " After clearing the index = " + list); 

		List<Integer> newList = new ArrayList<>(Arrays.asList(4, 2, 1, 3, 6, 5, 9, 7, 8));
        



        System.out.println("New List " + newList); 


    }


	public  void LinkedListOperation()
	{
		

		LinkedList<Integer> mewLinkedList  =  new LinkedList<>();

		System.out.println("-------------Linked List------------------------");
		linkedList.add(4);
		linkedList.add(2);

		linkedList.add(0, 12);
		linkedList.add(45);

		// linkedList

		mewLinkedList.addFirst(4);
		mewLinkedList.addLast(45);

		System.out.println("removeFirst  = " + mewLinkedList.removeFirst());
		System.out.println("removeIf  = " + mewLinkedList.removeIf(n -> n == 4));
		System.out.println("removeLast  = " + mewLinkedList.removeLast());

		mewLinkedList.addFirst(6);	
		mewLinkedList.addLast(5);

		mewLinkedList.addFirst(4);
		mewLinkedList.addLast(5);


		System.out.println(" Before removeFirstOccurrence  " +  mewLinkedList);

		System.out.println("removeFirstOccurrence 5 " + mewLinkedList.removeFirstOccurrence(5));

		System.out.println(mewLinkedList);
	
	}


		public  void VecotrOperation()
	{
		

		Vector<Integer>  vector = new Vector<>();

		System.out.println("-------------Vector------------------------");
		vectorList.add(4);

		vectorList.addAll(Arrays.asList(4 ,5,6,9,11));
		vectorList.addAll(new Vector<>(List.of(4 ,5,6,9,11)));
		vectorList.add(95);

		vector.addAll(vectorList);

		System.out.println("get  = " + vector.get(0));
		System.out.println("removeIf  = " + vector.elementAt(5));
		System.out.println("removeLast  = " + vector.firstElement());
	
	}


	public static void main(String[] args) {
		
		ListInterface listInterface = new ListInterface();

		listInterface.ListOperations();
		listInterface.LinkedListOperation();
	}

}
