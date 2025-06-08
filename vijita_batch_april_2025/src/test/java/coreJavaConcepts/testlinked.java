package coreJavaConcepts;

import java.util.ArrayList;

public class testlinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> todo = new ArrayList();

        todo.add("Buy groceries");
        todo.add("Read book");
        todo.add("Go to the gym");

        System.out.println("To-Do List (ArrayList):");
        for (String task : todo) {
            System.out.println(task);
        }

        // Insert task at the beginning
        todo.add(0, "Morning meditation"); // Slower in ArrayList
	}

}
