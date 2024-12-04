package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMethods {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayListMethods(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayListMethods() {
    }

    public void addingIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 7 integers: ");
        for (int i = 0; i < 7; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public ArrayList<Integer> deleteElements(int index){
    numbers.remove(index);
    return numbers;
    }

    public int findIndex(int element){
        return numbers.indexOf(element);
    }
}
