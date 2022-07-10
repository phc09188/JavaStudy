package codeTest;

import java.io.*;
import java.util.Arrays;

public class boj1233 {
    public static void main(String[] args) throws IOException {
        //최대 값 = 80
        int[] result = new int[81];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s1 = Integer.parseInt(input[0]);
        int s2 = Integer.parseInt(input[1]);
        int s3 = Integer.parseInt(input[2]);
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    result[i+j+k]++;
                }
            }
        }
        int max = Arrays.stream(result).max().getAsInt();
        for (int i = 0; i < (s1+s2+s3); i++) {
            if(result[i] == max){
                System.out.println(i);
                break;
            }
        }
    }
}
