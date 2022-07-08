package codeTest;
/*
    런타임 오류
 */
import java.io.*;
import java.util.*;
public class boj1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        if (1 <= m && n >= m && n <= Math.pow(10, 1000)) {
            System.out.println(n / m);
            System.out.println(n % m);
        }
    }
}
