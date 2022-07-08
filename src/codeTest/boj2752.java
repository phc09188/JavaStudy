package codeTest;
import java.io.*;
import java.util.*;

public class boj2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
