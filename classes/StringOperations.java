import java.util.Scanner;

public class StringOperations {
    public String reverseString (String name){
        String str = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            str += name.charAt(i);
        }
        return str;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        StringOperations reverse = new StringOperations();
        System.out.println(reverse.reverseString(name));
    }
}
