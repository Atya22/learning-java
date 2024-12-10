package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ArrayListMethods
        ArrayListMethods arrayListMethods = new ArrayListMethods();

        arrayListMethods.addingInteger(1);
        arrayListMethods.addingInteger(2);
        arrayListMethods.addingInteger(3);
        arrayListMethods.addingInteger(4);
        arrayListMethods.addingInteger(5);
        arrayListMethods.addingInteger(6);

        // Print the original list
        System.out.println("Original List: " + arrayListMethods.getNumbers());

        // Delete an element at a specific index
        int indexToDelete = 2; // Example: remove the 3rd element (index 2)
        arrayListMethods.deleteElement(indexToDelete);
        System.out.println("After deleting element at index " + indexToDelete + ": " + arrayListMethods.getNumbers());

        // Find the index of a specific element
        int elementToFind = 50; // Example: find the index of 50
        int foundIndex = arrayListMethods.findIndex(elementToFind);
        if (foundIndex != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + elementToFind + " not found in the list.");
        }
    }
}
