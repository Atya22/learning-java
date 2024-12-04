import java.util.LinkedList;

public class LinkedListMax {
    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.add("Hello");
        myLinkedList.add("How");
        myLinkedList.add("is");
        myLinkedList.add("the");
        myLinkedList.add("Weather");

        int max = 0;
        String theWords = "";
        for (String s : myLinkedList){
            if (s.length() > max){
                max = s.length();
                theWords = s;
            }
        }
        System.out.println(theWords);
    }
}
