package codeTest;

import java.io.*;
import java.util.*;
public class boj2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int result = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a == b && b == c && a == c) {
            result = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            if (a == b || a == c) {
                result = 1000 + a*100;
            } else {
                result = 1000 + b*100;
            }
        }else{
            if(a>=b && a>=c){
                result = 100*a;
            }else if(b>=c && b>=a){
                result = 100*b;
            }else if(c>=a && c>=b){
                result = 100*c;
            }
        }
        System.out.println(result);
    }
}
