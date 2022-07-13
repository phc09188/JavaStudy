package codeTest;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int[] firstarr = new int[n];
        for (int i = 0; i < n; i++) {
            firstarr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(firstarr);
        int m = Integer.parseInt(br.readLine());
        input = br.readLine();
        st = new StringTokenizer(input);
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(firstarr, n, a) + " ");
        }
        System.out.println(sb);

    }

    private static int binarySearch(int[] firstarr, int n, int a) {
        int first = 0;
        int last = n -1;
        int mid = 0;
        while(first<= last){
            mid = (first + last)/2;
            if(firstarr[mid] ==a){
                return 1;
            }
            if(firstarr[mid] <a){
                first = mid +1;
            }else{
                last = mid -1;
            }
        }
        return 0;
    }
}