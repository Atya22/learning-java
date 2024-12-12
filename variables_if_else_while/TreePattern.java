public class TreePattern {
    public static void main(String[] args) {
        int height = 4;
        int width = 7;
        int middle = width / 2;
        System.out.println(middle);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= (middle - i) && j <= (middle + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}