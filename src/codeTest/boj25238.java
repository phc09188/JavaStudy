package codeTest;


import java.io.*;
import java.util.StringTokenizer;

public class boj25238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double result = (double)a - (a*b/100.00);
        int c =1;
        if(a >=0 && a<=500 && b>=0 && b<=100){
            if(result >=100) {
                c = 0;
                System.out.println(c);
            }else {
                System.out.println(c);
            }
        }
    }
}
