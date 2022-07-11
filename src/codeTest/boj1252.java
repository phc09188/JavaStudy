package codeTest;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class boj1252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        BigInteger a = new BigInteger(st.nextToken(), 2);
        BigInteger b = new BigInteger(st.nextToken(), 2);
        BigInteger sum = a.add(b);
        System.out.println(sum.toString(2));
    }
}
