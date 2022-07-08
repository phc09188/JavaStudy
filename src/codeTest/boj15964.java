package codeTest;



import java.io.*;
import java.util.StringTokenizer;

public class boj15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long result = (a+b)*(a-b);
        if(a >=1 && b<=100000){
            System.out.println(result);
        }

    }
}
