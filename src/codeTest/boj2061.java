package codeTest;
import java.io.*;
import java.util.*;

public class boj2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        long k = Long.parseLong(input[0]);
        long l = Long.parseLong(input[1]);
        long first =0, last = 0;
        if(k>=4 && l>=2 && k>l){
            for (int i = 2; i < k/2; i++) {
                if(k%i == 0){
                    if(k>i){first = i; last = k;}
                    else{first = k; last = i;}
                }
            }
            if (first >= k && last >= k) {
                System.out.println("GOOD");
            } else {
                System.out.println("BAD " + first);
            }
        }
    }
}
