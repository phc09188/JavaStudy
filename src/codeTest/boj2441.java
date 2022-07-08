package codeTest;

import java.io.*;
public class boj2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if(n>=1 && n<=100) {
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if (i >= cnt) {
                        System.out.print("*");
                    } else if (i < n - 1) {
                        System.out.print(" ");
                    }
                    if (i == (n - 1)) {
                        System.out.println();
                    }
                }
                cnt++;
            }
        }
    }
}
