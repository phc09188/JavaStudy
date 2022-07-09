package codeTest;

import java.io.*;
import java.util.StringTokenizer;

public class boj1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int realm = m;
        int cnt = 0;
        int result = 0;
        while(cnt != N){
            if(m+T>M && cnt ==0){
                System.out.println(-1);
                break;
            } else if((m+T)<=M){
                m = m + T;
                result ++;
                cnt++;
            }else if((m+T)>M){
                if(realm> m-R){
                    m = realm;
                }else{
                    m = m - R;
                }
                result ++;
            }
        }
        if(cnt == N){
            System.out.println(result);
        }
    }
}
