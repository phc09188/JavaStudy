package codeTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class boj1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[n];
        int alphabet[] = new int[26];
        boolean isNot = false;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            arr[i] = input.charAt(0);
        }
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - (int) 'a';
            alphabet[index]++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] >=5){
                int index = i + (int)'a';
                sb.append((char)index);
                isNot = true;
            }
        }
        if(isNot){
            System.out.println(sb);
        }else{
            System.out.println("PREDAJA");
        }

    }
}
