package codeTest;

import java.io.*;
import java.util.*;
public class boj1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        double x = Math.sqrt((H*H) + (W*W));
        double percent = D / x;
        System.out.printf("%d %d", (int)(H*percent), (int)(W * percent));
    }
}
