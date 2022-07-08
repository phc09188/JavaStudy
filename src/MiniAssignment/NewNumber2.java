package MiniAssignment;
import java.io.*;

public class NewNumber2 {
    public static void main(String[] args) throws IOException {
        FileUtils fu = new FileUtils();
        String file = fu.getLoadText("text.txt");
        int fileLength = file.length();
        float[] number = new float[26];
        String[] alphabet = {"A", "B", "C", "D", "E", "F"
                , "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < file.length(); i++) {
            int input = file.charAt(i);
            if (input >= 97 && input <= 122) {
                number[input - 97] += 1;
            } else if (input >= 65 && input <= 90) {
                number[input - 65] += 1;
            }
        }
        for (int i = 0; i < number.length; i++) {
            float percentage = (number[i] / fileLength) * 100;
            System.out.printf("%s =     %f개,     %.2f", alphabet[i], number[i], percentage);
            System.out.print("%");
            System.out.println();
        }
    }
}
