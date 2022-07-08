package codeTest;
/*
    Arrays.stream() 써보기

 */

import java.io.*;
import java.util.*;

public class boj10807 {
    public static void main(String[] args) throws IOException {
        int cnt =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if(arr[i] == v){
                cnt++;
            }
        }
        if(n>=1 && n<=100){
            if(Math.abs(v) <=100){
                System.out.println(cnt);
            }
        }
    }
}
