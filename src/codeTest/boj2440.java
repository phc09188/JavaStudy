package codeTest;


import java.io.*;
public class boj2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for (int j = 0; j < input; j++) {
            for (int k = 0; k < input -j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
