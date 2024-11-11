public class PrintAlphabet {
    public static void main(String[] args){
        char letter = 'a';
        char upperLetter = 'A';

        while (letter <= 'z') {
            System.out.print(letter);
            letter++;
        }

        while (upperLetter <= 'Z') {
            System.out.print(upperLetter);
            upperLetter++;
        }
    }
}