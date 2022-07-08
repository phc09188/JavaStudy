package codeTest;
import java.io.*;
public class boj2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int r = Integer.parseInt(br.readLine());
            if(i == (n-1)){
                cnt +=r;
            }else{
                cnt +=(r-1);
            }
        }
        if(n>=1 && cnt <=1000){
            System.out.println(cnt);
        }
    }
}
