package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    private final ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayListMethods() {
    }

    public void addingInteger(int number) {
        numbers.add(number);
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void deleteElement(int index) {
        numbers.remove(index);
    }

    public int findIndex(int element) {
        return numbers.indexOf(element);
    }
}
