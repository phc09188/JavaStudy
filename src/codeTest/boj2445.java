package codeTest;

import java.io.*;

public class boj2445 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n>=1 && n<=100){
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n; j++) {
                    if(j<i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < n; j++) {
                    if(j == n-i){
                        for (int k = 0; k < i; k++) {
                            System.out.print("*");
                        }
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            int cnt = n-1;
            int a = 0;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n; j++) {
                    if(j<cnt) {
                        System.out.print("*");
                    }else if(j>=cnt){
                        System.out.print(" ");
                    }
                    if(j == n-1){
                        cnt--;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if(j<=a){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                    if(j == n-1&& i != n-2){
                        System.out.println();
                        a++;
                    }
                }
            }
        }
    }
}
