package codeTest;

import java.io.*;
import java.util.*;

public class boj1267 {
    public static int young(int i){
        int result = 0;
        do{
            if(i>0 && i<=30) {
                result = 10;
                i = 0;
            }else if(i>30){
                if(i%30 == 0){
                    result += ((i/30) * 10) + 10;
                    i = 0;
                }else {
                    result += ((i / 30) * 10) + 10;
                    i =0;
                }
            }

        }while(i>0);
        return result;
    }
    public static int Min(int i){
        int result = 0;
        do{
            if(i>=60){
                if(i%60 == 0){
                    result = ((i/60)*15)+15;
                    i =0;
                }else{
                    result = ((i/60)*15) + 15;
                    i =0;
                }
            }
            if(i< 60 && i>0){
                result = 15;
                i = 0;
            }
        }while(i>0);
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int Y =0;
        int M = 0;
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            Y += young(arr[i]);
            M += Min(arr[i]);
        }
        if(N>=1 &&N<=20 ){
            if(M > Y){
                System.out.println("Y " + Y);
            }else if(M==Y){
                System.out.println("Y M "+ Y);
            }else if(M<Y){
                System.out.println("M " + M);
            }
        }

    }
}
