package ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayListMethods myList = new ArrayListMethods();

        myList.addingIntegers();
        System.out.println(myList.getNumbers());

        System.out.println(myList.deleteElements(3));
        System.out.println(myList.deleteElements(5));

        System.out.println(myList.findIndex(3));
    }
}
