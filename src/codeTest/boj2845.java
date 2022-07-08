package codeTest;

import java.io.*;
import java.util.*;

public class boj2845 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        StringTokenizer st = new StringTokenizer(input1);
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String input2 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(input2);
        int num = P*L;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < 5; i++) {
            if(L>=1 && L<=10){
                if(P>=1 && P<=1000){
                    System.out.print((arr[i] - num) + " ");
                }
            }
        }
    }
}
