public class doWhile {
    public static void main(String[] args){
        int sum = 0;
        int i = 4;
        do {
         sum += i;
         i --;  
        }
        while (i > 0);

        System.out.println(sum);
    }
}
