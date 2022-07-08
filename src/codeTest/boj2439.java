package codeTest;
import java.io.*;

public class boj2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int input = Integer.parseInt(a);
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if((j+i+1) >= input){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
