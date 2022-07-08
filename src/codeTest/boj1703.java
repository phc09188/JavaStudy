package codeTest;
import java.io.*;
import java.util.*;
public class boj1703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        ArrayList arr = new ArrayList();
        do{
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            if(n == 0){
                break;
            }
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        a[i] = Integer.parseInt(st.nextToken());
                    } else if (j == 1) {
                        b[i] = Integer.parseInt(st.nextToken());;
                    }
                }
            }
            int count = a[0] - b[0];
            for (int i = 1; i < n; i++) {
                count = count * a[i] - b[i];
            }
            arr.add(count);
        }while(!input.equals("0"));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
