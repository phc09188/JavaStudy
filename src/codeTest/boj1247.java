package codeTest;

import java.io.*;

public class boj1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        long[] result = new long[3];
        while(count <3){
            long sum = 0;
            int N = Integer.parseInt(br.readLine());
            long[][] input = new long[3][N];
            if(N>=1 &&N<=100000) {
                for (int i = 0; i < N; i++) {
                    input[count][i] = Long.parseLong(br.readLine());
                    sum += input[count][i];
                }
                result[count] = sum;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if(result[i] > 0){
                System.out.println("+");
            }else if(result[i] == 0){
                System.out.println("0");
            }else if(result[i] <0){
                System.out.println("-");
            }
        }
    }
}
