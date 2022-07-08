package codeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        boolean[] isboll = {true, false, false};


        if(M>0 && M <=50) {
            for (int i = 0; i < M; i++) {
                String input = br.readLine();
                StringTokenizer st = new StringTokenizer(input);
                int first = Integer.parseInt(st.nextToken()) -1;
                int last = Integer.parseInt(st.nextToken()) -1;
                for (int j = 0; j < isboll.length; j++) {
                    if(isboll[j]){
                        if(j == first){
                            isboll[last] = true;
                            isboll[j] = false;
                            break;
                        }else if(j == last){
                            isboll[first] = true;
                            isboll[j] = false;
                            break;
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < isboll.length; i++) {
            if(isboll[i] == true){
                System.out.println(i+1);
            }
        }
    }
}
