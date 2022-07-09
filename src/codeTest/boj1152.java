package codeTest;

import java.io.*;
import java.util.Arrays;

public class boj1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < input.length; i++) {
            if(!input[i].equals("")){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
