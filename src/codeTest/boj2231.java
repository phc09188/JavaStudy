package codeTest;

import java.io.*;
public class boj2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        boolean isEmpty = false;
        //1부터 n까지 순차적으로 분해합 수가 있는지 확인
        //발견 되면 isEmpty를 true로 전환하고 반환문 종료
        while(cnt <n){
            String a = String.valueOf(cnt);
            String[] index = a.split("");
            int sum =0;
            for (int i = 0; i < index.length; i++) {
                sum += Integer.parseInt(index[i]);
            }
            if((cnt+sum) == n){
                isEmpty = true;
                break;
            }else{
                cnt++;
            }
        }
        if(!isEmpty){
            System.out.println(0);
        }else{
            System.out.println(cnt);
        }
    }
}
