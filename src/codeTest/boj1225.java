package codeTest;


import java.io.*;
import java.util.StringTokenizer;

public class boj1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input  = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        String A = st.nextToken();
        String B = st.nextToken();
        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();
        long sum1 = 0;
        long sum2 = 0;
        for(char c : aChars){
            sum1 += Character.getNumericValue(c);
        }
        for(char c : bChars){
            sum2 += Character.getNumericValue(c);
        }
        System.out.println(sum1 * sum2);
    }
}
