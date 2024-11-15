


import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        System.out.println("-- ArrayList -----");

        ArrayList<String> list = new ArrayList<>();


        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + list);

        // Accessing an element
        String fruit = list.get(1); // Gets the element at index 1
        System.out.println("Element at index 1: " + fruit);

        // Updating an element
        list.set(2, "Mango");
        System.out.println("Updated ArrayList: " + list);

        // Removing an element
        list.remove(3); // Removes the element at index 3
        System.out.println("ArrayList after removal: " + list);

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Iterating over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }

        // Clearing the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}
