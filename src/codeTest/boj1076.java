package codeTest;

import java.io.*;
public class boj1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int[] score = {0,1,2,3,4,5,6,7,8,9};
        int[] multi = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        int cnt = 0;
        long result = 0;
        while(cnt<2){
            String input = br.readLine();
            for (int i = 0; i < 10; i++) {
                if(color[i].equals(input)&& cnt ==0){
                    result += 10*score[i];
                }else if(color[i].equals(input)&& cnt ==1){
                    result += score[i];
                }
            }
            cnt++;
        }
        while(cnt>=2 && cnt<3){
            String input = br.readLine();
            for (int i = 0; i < 10; i++) {
                if(color[i].equals(input)){
                    result *= multi[i];
                }
            }
            cnt++;
        }
        System.out.println(result);
    }
}
