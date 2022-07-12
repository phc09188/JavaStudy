package codeTest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
public class boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean end = false;
        int cnt = 0;

        do {
            String input = br.readLine();
            if(input.equals("0 0 0")){
                end = true;
                break;
            }else{
                String[] input1 = input.split(" ");
                int a = Integer.parseInt(input1[0]);
                int b = Integer.parseInt(input1[1]);
                int c = Integer.parseInt(input1[2]);
                int powa = (int) Math.pow(a, 2);
                int powb = (int) Math.pow(b, 2);
                int powc = (int) Math.pow(c, 2);
                int sumd2 = (powa + powb + powc)/2;
                if(sumd2 ==powa || sumd2 == powb || sumd2 == powc){
                    sb.append("right" + "\n");
                }else{
                    sb.append("wrong" + "\n");
                }
            }
        }while(!end);
        System.out.println(sb);
    }
}
