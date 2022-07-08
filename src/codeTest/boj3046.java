package codeTest;

import java.io.*;
import java.util.*;

public class boj3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int result = 0;
        result = (2*s) - r1;
        System.out.println(result);
    }
}
