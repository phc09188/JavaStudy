package codeTest;

import java.io.*;
import java.util.*;

public class boj1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int P = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);
        while(P/2>K) {
            int first = 0, last = 0;
            if (P >= 4 && K >= 2) {
                for (int i = 2; i < P / 2; i++) {
                    if (P % i == 0) {
                        first = i;
                        last = P / i;
                    }
                }
            }else{
                break;
            }
            if (first > last) {
                int tmp = first;
                first = last;
                last = tmp;
            }
            if (first >= K && last >= K) {
                System.out.println("GOOD");
                break;
            } else {
                System.out.println("BAD " + first);
                break;
            }
        }
    }
}
