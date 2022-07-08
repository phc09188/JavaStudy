package codeTest;

import java.io.*;
import java.util.*;
public class boj2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ab = br.readLine();
        StringTokenizer st = new StringTokenizer(ab);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String da = br.readLine();
        st = new StringTokenizer(da);
        int d = Integer.parseInt(st.nextToken());
        if(d<=500000 && a<24 && b<60 && c<60) {
            if (d >= 3600) {
                a += d / 3600;
                d = d % 3600;
            }
            if (d >= 60) {
                b += d / 60;
                d = d % 60;
            } else {
                c += d;
            }
            if (c >= 60) {
                c = c - 60;
                b += 1;
            }
            if (b >= 60) {
                b = b - 60;
                a += 1;
            }
            if (a >= 24) {
                a = a - 24;
            }
            System.out.println(a + " " + b + " " + c);
        }
    }
}
