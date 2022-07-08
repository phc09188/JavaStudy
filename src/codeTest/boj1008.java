package codeTest;
import java.io.*;
import java.util.*;

public class boj1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a>0 && b<10){
            double result = (double)a/b;
            System.out.println(result);
        }
    }
}
