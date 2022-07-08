package codeTest;

import java.io.*;
import java.util.*;
public class boj1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList count = new ArrayList();
        boolean is = false;

        while(!is){
            int cnt = 0;
            String input1 = br.readLine();
            if(input1.equals("#")){
                is = true;
            }
            for (int i = 0; i < input1.length(); i++) {
                if(input1.charAt(i)== 'a'||
                        input1.charAt(i)== 'A'||
                        input1.charAt(i)== 'e'||
                        input1.charAt(i)== 'E'||
                        input1.charAt(i)== 'I'||
                        input1.charAt(i)== 'i'||
                        input1.charAt(i)== 'O'||
                        input1.charAt(i)== 'o'||
                        input1.charAt(i)== 'u'||
                        input1.charAt(i)== 'U'){
                    cnt +=1;
                }
            }
            count.add(cnt);
        }
        for (int i = 0; i < count.size()-1; i++) {
            System.out.println(count.get(i));
        }
    }
}
