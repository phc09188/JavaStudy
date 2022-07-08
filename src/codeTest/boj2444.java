package codeTest;
import java.io.*;
public class boj2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n>=1&& n<=100){
            int cnt = n-1;
            if (n >= 1 && n <= 100) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == cnt) {
                            for (int k = 0; k < 2 * i + 1; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            break;
                        } else {
                            System.out.print(" ");
                        }
                    }
                    cnt--;
                }
                cnt = 1;
                for (int i = n; i > 0; i--) {
                    for (int j = n; j > 0; j--) {
                        if (i - j <= 0) {
                            System.out.print(" ");
                        } else {
                            for (int k = 0; k < (2 * n) - (2 * cnt)-1; k++) {
                                System.out.print("*");
                            }
                            cnt++;
                            System.out.println();
                            break;
                        }
                    }
                }
            }
        }
    }
}
