package codeTest;
import java.io.*;
/*
    StringBuilder를 사용하여 풀어보자 .append
 */
public class boj11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        boolean END = true;
        String result = "";
        while(END){
            input = br.readLine();
            if(input.equals("END")){
                END = false;
            }else if(input.length()>500){
                END = false;
            }else{
                StringBuffer sb = new StringBuffer(input);
                result += sb.reverse().toString() + "\n";
            }
        }
        System.out.println(result);
    }
}
