package codeTest;

import java.io.*;

public class boj9358 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[] winner = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] input1 = br.readLine().split(" ");
            int[] input = new int[input1.length];
            for (int j = 0; j < n; j++) {
                input[j] = Integer.parseInt(input1[j]);
            }
            winner[i] = whowin(Fold(input));
        }
        for (int i = 0; i < t; i++) {
            System.out.printf("Case #%d: ", i+1);
            if(winner[i]){
                System.out.printf("Alice\n");
            }else{
                System.out.printf("Bob\n");
            }
        }
    }
    public static int[] Fold(int[] arr){
        if(arr.length == 2){
            return arr;
        }
        if(arr.length %2 != 0){
            int n = (Math.round((float)arr.length / (float) 2));
            int[] res = new int[n];
            for (int i = 0; i < n - 1; i++) {
                res[i] = arr[i] + arr[arr.length -i-1];
            }
            res[n-1] = arr[n-1] *2;
            return Fold(res);
        }else{
            int n = arr.length/2;
            int[] res = new int[n];
            for (int i = 0; i < n - 1; i++) {
                res[i] = arr[i] + arr[arr.length-1-i];
            }
            return Fold(res);
        }
    }
    public static boolean whowin(int[] arr){
        return (arr[0] > arr[1]);
    }
}
