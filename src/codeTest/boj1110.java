package codeTest;

import java.io.*;

public class boj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;
        int cnt = 0;
        do{
            String[] index = String.valueOf(result).split("");
            int[] num = new int[index.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(index[i]);
            }
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
                if(sum >10){
                    sum = sum -10;
                }else if(sum ==10){
                    sum = 0;
                }
            }
            cnt++;

            result = num[index.length -1]*10 + sum;
        }while(n != result);
        System.out.println(cnt);
    }
}
