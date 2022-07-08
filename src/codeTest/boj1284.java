package codeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList result = new ArrayList();
        boolean zero = false;
        int count = 0;
        while(!zero){

            int a = 2;
            String input = br.readLine();
            if(input.equals("0")){
                zero = true;
                break;
            }else {
                a += input.length() - 1;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '1') {
                        a += 2;
                    } else if (input.charAt(i) == '0') {
                        a += 4;
                    } else if (input.charAt(i) >= 50 && input.charAt(i) <= 57) {
                        a += 3;
                    }
                }
                count++;
                result.add(a);
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(result.get(i));
        }

    }
}
