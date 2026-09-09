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


		System.out.println("addAll() = " + list.addAll(1, new ArrayList<>(Arrays.asList(4,5,6,8))));
        System.out.println(  "after addAll() "+ list); 
		System.out.println(list.contains(2));

        System.out.println(list); 


    }

	public static void main(String[] args) {
		
		ListInterface listInterface = new ListInterface();

		listInterface.ListOperations();
	}

}
