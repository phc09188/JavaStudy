package codeTest;

import java.io.*;

public class boj1212 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int ten = Integer.parseInt(n, 8);
        String result = Integer.toString(ten, 2);
        System.out.println(result);
    }
}
