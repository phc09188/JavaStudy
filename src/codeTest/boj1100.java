package codeTest;

import java.io.*;
public class boj1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == '.'){
                    arr[i][j] = '.';
                }else if(input.charAt(j) == 'F'){
                    arr[i][j] = 'F';
                }
            }
        }
        int cnt =0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i%2==0 && j%2 ==0){
                    if(arr[i][j] == 'F'){
                        cnt++;
                    }
                }else if(i%2==1 && j%2 ==1){
                    if(arr[i][j] == 'F'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
