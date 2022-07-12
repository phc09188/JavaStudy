package codeTest;

import java.io.*;
import java.util.*;
//시도1 ArraysStream sort
//시도2 list sort
//시도3 collections sort
//시도4 StringBuilder 추가 + list <integer>로 못 박기
//시도5 BufferedWriter

public class boj2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr.get(i) + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }


    public void Timeover() throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br1.readLine());
        int[] result1 = new int[n1];
        if (n1 >= 1) {
            for (int i = 0; i < n1; i++) {
                result1[i] = Integer.parseInt(br1.readLine());
            }
            Arrays.sort(result1);
            for (int i = 0; i < result1.length; i++) {
                System.out.println(result1[i]);
            }
        }
    }
}
